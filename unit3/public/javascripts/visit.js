/**
 * This is called to start the application (via the FBInit and
 * the dom ready functions).  
 */
tutorial.visitUI = function() {
	"use strict";
	tutorial.idMap = {}; //keyed by name
	tutorial.locMap= {}; //keyed by name
	tutorial.locDetails = null; //our current location displayed
	console.log("-----get login status-----");
	FB.getLoginStatus(function(response) {
		console.log(response);
		if (response.status === 'connected') {
			console.log("----- connected user --------");
		    //load the friend list into the autocomplete box
		    FB.api('/me/friends?fields=name,location,hometown', function (response) {
				$( "#friend" ).autocomplete({
					source: response.data.map(tutorial.importFriendData).
						filter(function (x) {return x!=null;}),
				});
		    });
		 } else if (response.status === 'not_authorized') {
			console.log("need to authorize my app");
		 } else {
			console.log("not logged into FB");
		 }
	});
	var myOptions = {
          center: new google.maps.LatLng(48.858518, 2.294405),
          zoom: 8,
          mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    var map = new google.maps.Map(document.getElementById("map_canvas"),
    		myOptions);
    var h = $("#map_canvas").css('height');
    console.log("height is "+h);
};


/**
 * This function is "mapped" onto the list of friends returned.  It returns
 * null to indicate that we don't have any location information.  This null
 * will be filtered out by later processing.  Otherwise it returns an FB
 * ID that is the location.
 */
tutorial.importFriendData=function (user) {
	if ((!user.location) && (!user.hometown)) {
		//console.log("user "+user.name+" is a loser and has no location info");
		return null
	}
	//console.log(user);
	tutorial.idMap[user.name]=user.id;
	if (user["location"]!=null) {
		console.log("user "+user.name+" has location:"+
				JSON.stringify(user.location));
		tutorial.locMap[user.name]=user.location;
	} else {
		tutorial.locMap[user.name]=user.hometown;
	}
	return user.name;
}

/**
 * Called when the page is full initialized.  You can't do jquery operations
 * until the dom is ready.
 */
tutorial.domReady = function() {
	console.log("----dom ready----");
	tutorial.visitUI();
	tutorial.checkReady();
	$( "#outpicker" ).datepicker({
		onSelect: tutorial.outChosen
	});
	$( "#returnpicker" ).datepicker({
		onSelect: tutorial.retChosen
	});
	$( "#friend" ).autocomplete({
		change: tutorial.friendChanged,
	});
	$( "button.searchButton").button();
	$("button.searchButton").click(tutorial.startResult)
};

/**
 * This is called when the user selects a friend from the drop-down or otherwise
 * indicates that he/she is finished typing.  We check to see if we know the
 * person.  If we do, we load the user's profile photo.
 */
tutorial.friendChanged = function (event,ui) {
	var name = $("#friend").val();
	//console.log("friend changed:"+name);
	if ((name==null) || (name=="")) {
		tutorial.checkReady();
		return;
	}
	if (!tutorial.idMap[name]) {
		tutorial.checkReady();
		return;
	}
	tutorial.locDetails = null;
	
	FB.api("/"+tutorial.idMap[name]+"/picture?type=large", function (response) {
		if (!response.error) {
			var img = $("<img src='"+response+"'/>").hide();
			var h4 = $("<h4>").text(name)
			$(".friendPhoto").empty().append(img).append(h4);
			img.fadeIn("slow");
		}
	});
	FB.api("/"+tutorial.locMap[name]["id"], function (response) {
		tutorial.locDetails=response;
		var a = $("<H3>").append($("<A>").attr("href",response.link).
				text(response.name));
		var span = $("<span>").html(response.description);
		$("div.itinPanel").empty().append(a);
		$("div.itinPanel").append(span);
		tutorial.checkReady();
	});
	tutorial.checkReady();
};

tutorial.outChosen= function (dateText, inst) {
	tutorial.checkReady();
};

tutorial.retChosen= function (dateText, inst) {
	tutorial.checkReady();
};

/**
 * Compute what status line is needed to help the user along.
 */
tutorial.checkReady = function () {
	var allOk=false;
	
	while (true) {
		var name = $("#friend").val();
		
		if ((name==null) || (name=="")) {
			tutorial.setStatusLine("Start typing a friend's name in the blank above...");
			break;
		}
		if (!tutorial.idMap[name]) {
			tutorial.setStatusLine("Start typing a friend's name in the blank above...");
			break;
		}
		
		var out = $("#outpicker").datepicker("getDate");
		if ((out==null) || (out=="")) {
			tutorial.setStatusLine("Click on the outbound blank to set a departure date...");
			break;
		}
		
		var ret = $("#returnpicker").datepicker("getDate");
		if ((ret==null) || (ret=="")) {
			tutorial.setStatusLine("Click on the return blank to set a return date...");
			break
		}
		
		if (out.valueOf() > ret.valueOf()) {
			tutorial.setStatusLine("Please correct the return date to be after the departure date.");
			break;
		}

		if (tutorial.locDetails == null) {
			tutorial.setStatusLine("Still waiting to get location data from Facebook...");
			break;
		}
		//everything is ok
		allOk=true;
		break;
	}
	
	if (!allOk) {
		$("button.searchButton").hide();
	} else {
		$("button.searchButton").fadeIn();
		tutorial.setStatusLine("Click on the search button to search for low fares...");
	}
	
};

/**
 * Cute way to set the status line towards the bottom of this page.
 */
tutorial.setStatusLine = function (msg) {
	var h4=$("<H4>").text(msg).hide();
	$("div.statusLine").empty().append(h4);
	h4.fadeIn();
};

/**
 * This is called to start sending the results to the server.
 */
tutorial.startResult = function () {
	console.log($("#outpicker").datepicker("getDate"));
	console.log($("#returnpicker").datepicker("getDate"));
	console.log(tutorial.locDetails);
	FB.api("/me?fields=location,hometown", function (result) { 
		if ((result["hometown"]==null) && (result["location"]==null)) {
			alert("Sorry, but we can't compute flights if you have not set "+
					"your hometown or current location");
			return;
		}
		var origin = result['hometown'];
		if (result['location']!=null) {
			origin = result['location'];
		}
		console.log("origin is ... "+origin["name"]);
		var out = $.datepicker.formatDate('yy-mm-dd',$("#outpicker").datepicker("getDate"));
		var ret = $.datepicker.formatDate('yy-mm-dd',$("#returnpicker").datepicker("getDate"));
		
		if (!origin["location"]) {
			FB.api("/"+origin["id"], function (result) {
				tutorial.sendArgs(out, ret,
						result["location"],
						origin["name"],
						tutorial.locDetails["location"],
						tutorial.locDetails["name"]);
			});
		} else {
			//already have the location info
			tutorial.sendArgs(out,ret,
					origin["location"],
					origin["name"],
					tutorial.locDetails["location"],
					tutorial.locDetails["name"]);			
		}
	});
};

tutorial.RESULTS_DISPLAYED = 5;

tutorial.sendArgs = function(out, ret, origin, originName, dest, destName) {
	var content = { "outbound": out,
		"ret": ret,
		"originLat": origin["latitude"],
		"originLon": origin["longitude"],
		"destLat": dest["latitude"],
		"destLon": dest["longitude"],
		"originName": originName.toString(),
		"destName": destName.toString()
	};
	$( "button.searchButton" ).button( "option", "label", "searching...");	
	$( "button.searchButton" ).button( "option", "disabled", false );

	$.ajax({
		url: "/visit/go",
		data: $.param(content), 
		type: "GET",
		dataType: "json",
		success: function (result) {
			tutorial.reenableButton();
			tutorial.displayResults(result);
		},
		error: function (request, status, error) {
			tutorial.reenableButton();
			alert("Error processing ajax request:"+status+"("+error+")");
		}
	});
}

tutorial.reenableButton = function() {
	$( "button.searchButton" ).button( "option", "disabled", false );
	$( "button.searchButton" ).button( "option", "label", "Search!");
	tutorial.checkReady();
}

tutorial.displayResults = function(all) {
	var len = all.length;
	var i = 0;
	
	tutorial.flightData = all;
	$("div.flightData").empty();
	
	while ((i < len) && (i<tutorial.RESULTS_DISPLAYED)){
		var journey = all[i];
		var heading = $("<h4>");
		heading.append($("<a>").text(journey.price+" in "+journey.currency));
		var content = $("<div class='journey'>");
		var numberSegs = journey.seg.length;
		var j = 0;
		while (j < numberSegs) {
			var seg = journey.seg[j];
			var p = $("<p class='tight'>");
			var span = $("<span class='where'>");
			span.text("From "+seg.origin+" to "+seg.dest);
			//p.append(span);
			content.append(span);
			span = $("<span class='when'>");
			span.text(seg.depTime);
			//p.append(span);
			//p.append($("<br/>"));
			content.append(span);
			content.append($("<br/>"));
			span = $("<span class='flight'>");
			span.text("Flight "+seg.carrier+" #"+seg.flight);
			//p.append(span);
			content.append(span);
			content.append($("<br/>"));
			//content.append(p);
			
			j++;
		}
		//candidate ready
		content.attr("id","journey-"+i);
		heading.attr("id","heading-"+i);
		if (i!=0) {
			content.hide();
		} else {
			content.toggleClass("open");
			heading.toggleClass("open");
			heading.click((function(i) {
		                   return function() {
		                    tutorial.openClose(i);
		                   };
		                })(i));
		}
		//insert into the big boy
		$("div.flightData").append(heading);
		$("div.flightData").append(content);
		heading.click((function(i) {
            return function() {
                tutorial.openClose(i);
               };
            })(i));
		
		//ok, can increment now
		i++;
	}
}

tutorial.openClose = function(clicked) {
	var isOpen = $("#heading-"+clicked).hasClass("open");
	if (isOpen) {
		return;
	}
	$("#heading-"+clicked).slideDown().toggleClass("open");
	$("#journey-"+clicked).slideDown().toggleClass("open");
	for (var i =0 ; ((i<tutorial.flightData.length) &&  (i<tutorial.RESULTS_DISPLAYED)); ++i) {
		if (i==clicked) {
			continue;
		}
		var wasOpen = $("#heading-"+i).hasClass("open"); 
		if (wasOpen) {
			$("#heading-"+i).toggleClass("open");
			$("#journey-"+i).slideUp().toggleClass("open");
		}
	}
}


tutorial.clickResult = function(which) {
	console.log("click result "+which);
}
