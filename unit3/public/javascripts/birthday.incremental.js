/**
 * This file is primarily for implementing the progress bar that
 * shows the user what is going on inside the application.
 */


//namespace
tutorial = {};

//these have to be coordinated with conf/routes so the correct URL gets
//called in the space of /birthday
tutorial.bday = {
		FRIENDS: "friend",
		GEOGRAPHY: "geo",
		PRICE: "price",
}

//user messages for screen
tutorial.message = {};
tutorial.message[tutorial.bday.FRIENDS]="Loading your friend data...";
tutorial.message[tutorial.bday.GEOGRAPHY]= "Loading geography data...";
tutorial.message[tutorial.bday.PRICE]= "Loading lowest airfares from travelport...";

//succession of steps
tutorial.succ = {};
tutorial.succ[tutorial.bday.FRIENDS]=tutorial.bday.GEOGRAPHY;
tutorial.succ[tutorial.bday.GEOGRAPHY]=tutorial.bday.PRICE;
tutorial.succ[tutorial.bday.PRICE]=null;

//used each time we want more data
tutorial.birthdaySearchMoreData = function(section) {
	"use strict";
	//the ajax call for more data
	$.ajax({
        type: "GET",
        url: "/birthday/"+section+"/"+tutorial.uuid,
        dataType:"json",
        success: function(data) {
        	tutorial.birthdaySearchUpdateProgress(section,data);
        }
	});    
};

//used to update progress bar
tutorial.birthdaySearchUpdateProgress = function(section, data) {
	"use strict";
	var done = (tutorial.size - data.result.remaining) * (1.0);
	var percent = done / ((1.0) * tutorial.size) * 100.0;
	$( "#progressbar" ).progressbar({value: percent });
	$( "div.recentname h3").empty().text(data.result.updateString);
	
	
	if ((data.result.price) && (data.result.price!="")) {
		console.log(data.result);
		var root = $("<div class='journey'>");
		var placeLink = $("<A>").attr("href","http://www.facebook.com/"+data.result.townid);
		placeLink.text(data.result.town);
		var friendLink = $("<A>").attr("href","http://www.facebook.com/"+data.result.friendid)
		friendLink.text(data.result.friend);
		var title = $("<h3>");
		title.append(friendLink);
		title.append(placeLink);
		var bday = $("<h4>").text("Birthday on: "+data.result.birthday+
				" Approximate Price:"+data.result.price);
		
		root.append(title).append(bday);
		var i = 0;
		while (i < data.result.journey.seg.length) {
			var segment = data.result.journey.seg[i];
			var span = $("<span class='segment'>").text("Flight "+segment.flight+" on "+
					segment.carrier+" @ "+segment.depTime+" from "+
					segment.origin+" to "+segment.dest);
			root.append(span);
			root.append($("<br/>"));
			i=i+1;
		}
		$("div.trips").append(root);
	}
	
	if (data.result.remaining!==0) {
		tutorial.birthdaySearchMoreData(section);
	} else {
		var next = tutorial.succ[section];
		if (next===null) {
			$("#progressbar").hide();
			$("div.recentUpdate").hide();
			$("div.loading").hide();
		} else {
			$("div.loading h3").empty();
			$( "#progressbar" ).progressbar({value: 0 });
			$( "div.recentname h3").empty();
			tutorial.startBirthdaySection(next);
		}
	}
}
	
//called when page is displayed, creates the progressbar... 
$(function() {
	$( "#progressbar" ).progressbar({
		value: 0
     });
	$("#progressbar").show();
	console.log("just inited progress bar");
});
  
//start a section
tutorial.startBirthdaySection = function(section) {
	$("div.loading h3").text(tutorial.message[section]);
	//the ajax call for more data
	$.ajax({
        type: "GET",
        url: "/birthday/init/"+section+"/"+tutorial.uuid,
        dataType:"json",
        success: function(data) {
        	tutorial.size = data.result.remaining;
        	tutorial.birthdaySearchMoreData(section);
        }
	});    

}

/**
 * This function is called _from the template_ to get everything started and
 * tell us our uuid and the starting size of the firs section.
 */
tutorial.initFriendSearch = function(uuid) {
	"use strict";
	console.log("uuid is "+uuid);
	tutorial.uuid = uuid;
	tutorial.startBirthdaySection(tutorial.bday.FRIENDS);
	alert(window.location.host);
}