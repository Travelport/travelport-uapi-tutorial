/**
 * The facebook app is mostly implemented here.  This handles all the FB
 * connectivity as well as hitting the server when we need uapi calls or
 * data from UCode.
 */

//departing 6 weeks from now
tutorial.DAYS_OUT = 42;
//staying one week
tutorial.DAYS_BACK = 49;

/**
 * These are the Z values for items in the google API only (markers, icons, 
 * lines).
 */
tutorial.LOW_Z = 1;
tutorial.MED_Z = 2;
tutorial.HIGH_Z = 3;

/**
  * Initialize the variables used by the app, plus setup the map and the UI.  It checks
  * the facebook connected status as well, but its not clear how you could actually invoke
  * the app unless you were logged in to FB.
  * 
  * This kicks off the networking by asking for information from FB about the
  * current user.
  */
tutorial.initialize = function() {
  var myOptions = {
    center: new google.maps.LatLng(48.858518, 2.294405),
    zoom: 3,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  tutorial.map = new google.maps.Map(document.getElementById("map_canvas"),
    myOptions);
  
  
  var start = new google.maps.LatLng(48.8640569, 2.3558704);
	
  $("body").css("position","relative");
  $("div#results").height(175);
  $("div#results").width(400);
  tutorial.bottomRight($("div#results"));
  tutorial.setTransparencyOfResults(50);
		  
  tutorial.redMarker = tutorial.makeMarker("FE7569");
  tutorial.orangeMarker = tutorial.makeMarker("FEC069");
  tutorial.blueMarker = tutorial.makeMarker("69F2FE");
  tutorial.greenMarker = tutorial.makeMarker("228b22");
  tutorial.blackMarker = tutorial.makeMarker("000000");
  tutorial.purpleMarker = tutorial.makeMarker("A020F0");
  tutorial.friendMap = {};
  tutorial.markerBundle = [];
  tutorial.searchInProgress=false;
  tutorial.itinMarkers = [];
  tutorial.itinLine = null;
  tutorial.itineraryOnScreen = false;
  tutorial.placesSeen = {};
  tutorial.locationToInfoWin = {};
  
  tutorial.friendQueueInit();
  tutorial.dialogBoxInit();
  
  FB.getLoginStatus(function(response) {
		if (response.status === 'connected') {
			console.log("----- connected user --------");
		    //load my data
		    FB.api('/me?fields=location,hometown', function (response) {
				  if ((!(response.hometown)) && (!(response.location))) {
					  alert("This application needs your location or hometown"
							  + " to be set in your facebook profile. Please take "+
							  " a moment to set one of these then try again.");
				  } else {
					  if (response.location) {
						  FB.api(response.location.id, tutorial.originDetails);
					  } else {
						  FB.api(response.hometown.id, tutorial.originDetails);
					  }
				  }
		    });
			FB.api("/me/picture?type=square", function(response) { 
				$("div#user").css("background-image","url('"+response+"')");
			});
		 } else if (response.status === 'not_authorized') {
			console.log("need to authorize my app");
		 } else {
			console.log("not logged into FB");
		 }
	});
};

/**
 * Initializing the little box in the lower left that shows you the progress
 * we are making on the friend queue.
 */
tutorial.friendQueueInit = function() {
	  tutorial.friendQueue = [];
	  var fqd = $("<div id='friendQueue'>");
	  fqd.css("height", "1.0em");
	  fqd.css("position","absolute");

	  var newTop =   $(window).height() * 0.9;
	  fqd.css("top", newTop);
	  fqd.css("background-color", "white");
	  fqd.css("color", "black");
	  fqd.css("left", "2%");
	  fqd.css("width", "200px");
	  fqd.css("border","1px solid black");

	  $("body").append(fqd);

	  tutorial.friendQueueDisplay = fqd;
}

/**
 * Called to setup the dialog box window that is used at startup and to
 * allow the user to input dates and number of travellers.  When first
 * called it creates the dialog box with the instructions.
 */
tutorial.dialogBoxInit = function () {
	var box = $("<div id='dialogBox'>");
	box.css("width","400");
	box.css("height","330");
	box.css("position", "absolute");
	
	var top =   ($(window).height() - box.height())/2.0;
	var left =   ($(window).width() - box.width())/2.0;

	box.css("top", top);
	box.css("left", left);
	box.css("background-color", "lightgrey");
	
	box.css("-moz-border-radius", "10px");
	box.css("webkit-border-radius","10px");
	box.css("border-radius" ,"10px"); /* future proofing */
	box.css("-khtml-border-radius", "10px");
	
	var overlay = $("<div id='overlay'>");;
	overlay.css("position", "absolute");
	overlay.css("left", "0px");
	overlay.css("top", "0px");
	overlay.css("width", $(window).width());
	overlay.css("height", $(window).height());
	overlay.css("background-color", "black");
	overlay.css("opacity", "0.5");
    overlay.css("filter", "alpha(opacity='50')");

    $("body").append(overlay);
	$("body").append(box);
	
	box.slideDown();
	tutorial.startupText(box, overlay);
};

/**
 * Put some informative text in the dialog box.
 */
tutorial.startupText = function(box, overlay) {
	var h3 = $("<H3>").text("Welcome To Travelport's Visit A Friend App");
	h3.css("background-color","white");
	h3.css("margin","0px");
	h3.css("padding","10px");
	h3.css("-moz-border-radius-topleft", "10px");
	h3.css("webkit-border-top-left-radius","10px");
	h3.css("-moz-border-radius-topright", "10px");
	h3.css("webkit-border-top-right-radius","10px");
	box.append(h3);

	var p=$("<p>").css("padding","3px 10px");
	p.text("Welcome!  This app lets you see all your friends who have a location"
			+" registered with Facebook on a map... and if you click on one, we'll "
			+" find you the lowest-cost way to go and visit them!");
	box.append(p);
	
	p=$("<p>").css("padding","3px 10px");
	/*p.text("This application knows about rail travel, and in places where it is "
			+"available, it will check to see if travelling by rail is a lower-cost "
			+"way to travel.");*/
	p.text("If you have multiple friends in the same place, we'll show you a green "+
			"marker and you can click it to see which friends are there.");
	box.append(p);

	p=$("<p>").css("padding","3px 10px");
	p.text("If you are curious, you can right-click on a friend's picture to see "
			+"the train stations and airports near them.");
	box.append(p);

	var button = $("<button>");
	button.text("Let's Go!");
	button.css("background-color", "white");
	button.css("margin-left","180px");
	button.css("width","40px");
	button.css("margin-top:0px");
	button.css("padding-top:0px");
	button.click(function (event) {
		box.slideUp();
		overlay.hide();
	});
	
	box.append(button);
}

/**
 * Called in response to FB giving us the details about the location of the
 * current user.  It drops a marker at the location and then asks our server
 * for information about the terminals nearby.
 */
tutorial.originDetails = function(response) {
	var content = { 
			 "name": response.name,
			 "lat": response.location.latitude,
			 "lon": response.location.longitude
		};
	
	tutorial.originLat = response.location.latitude;
	tutorial.originLon = response.location.longitude;
	tutorial.originName = response.name;

	var origin = new google.maps.LatLng(response.location.latitude, 
			response.location.longitude); 

	var marker = new google.maps.Marker({
	    position: origin,
	    shadow: tutorial.pinShadow,
	    icon: tutorial.purpleMarker,
	    map: tutorial.map,
	    title: "Your Location:\n"+response.name,
	    animation: google.maps.Animation.DROP,
	    zIndex: tutorial.HIGH_Z
	  });	
	
	tutorial.map.setCenter(origin);
	$.ajax({
		url: "/visit/terminal",
		data: $.param(content), 
		type: "GET",
		dataType: "json",
		success: function (result) {
			tutorial.showOrigin(marker, result);
		},
		error: function (request, status, error) {
			alert("Error processing ajax request:"+status+"("+error+")");
		}
	});
}

/**
 * For a given set of terminals, show markers for all the terminals. Before
 * doing this, it clears any terminal markers already on screen. This is called
 * when someone "right clicks" on a friend or the origin marker.
 */
tutorial.showMarkerBundle = function(result) {
	var i = 0;
	var topLat, bottomLat, leftLon, rightLon;
	
	var j = 0;
	while (j < tutorial.markerBundle.length) {
		tutorial.markerBundle[j].setMap(null);
		++j;
	}
	tutorial.markerBundle = [];
	
	while (i < result.length) {
//		console.log(result[i]);
		var terminal = result[i];
		var pin = tutorial.blueMarker;
		if (terminal.type==1) {
			pin = tutorial.orangeMarker;
			if (terminal.significant) {
				pin = tutorial.redMarker;
			}
		}
		var title = terminal.name;
		if (terminal.iata_code) {
			title = title + " ("+terminal.iata_code+")"
		} else if (terminal.ucode) {
			title = title + " ("+terminal.ucode +")";
		}
		title = title + "\n"+ terminal.distance+"km";
		var marker = new google.maps.Marker({
		    position: new google.maps.LatLng(terminal.lat, terminal.lon), 
		    shadow: tutorial.pinShadow,
		    icon: pin,
		    map: tutorial.map,
		    title: title,
		    animation: google.maps.Animation.DROP,
		    zIndex: tutorial.MED_Z
		  });	
		tutorial.markerBundle[tutorial.markerBundle.length] = marker;
		if (i===0) {
			topLat = terminal.lat;
			bottomLat = terminal.lat;
			leftLon = terminal.lon;
			rightLon = terminal.lon;
		} else {
			if (terminal.lat > topLat ){
				topLat = terminal.lat;
			}
			if (terminal.lat < bottomLat) {
				bottomLon = terminal.lat;
			}
			if (terminal.lon < leftLon) {
				leftLon = terminal.lon;
			}
			if (terminal.lon > rightLon) {
				rightLon = terminal.lon
			}
		}
		++i;
	}
	var bounds = new google.maps.LatLngBounds(
			new google.maps.LatLng(bottomLat, leftLon),
			new google.maps.LatLng(topLat,rightLon)
			);
	tutorial.map.fitBounds(bounds);
	
}

/**
 * This is called in response to getting the results of terminals near the
 * origin (logged in user).  It adds an event handler and then it starts 
 * the friend loading procedure with a request for all friends to FB.
 */
tutorial.showOrigin = function(marker, result) {
	tutorial.originBundle = result;
	google.maps.event.addListener(marker,"rightclick", function() {
		tutorial.showMarkerBundle(tutorial.originBundle);
	});
	//start loading the friends
    FB.api('/me/friends?fields=name,location,hometown', tutorial.locateFriends);

}
/**
 * This gets a (potentially large) list of friend responses back from FB.
 * This enqueues all the friends details, then it starts the process of
 * processing the queue.
 */
tutorial.locateFriends = function(response) {
	console.log("raw number of friends:"+response.data.length);
	tutorial.friendQueue = response.data.filter(function (x) {return ((x.location) || (x.hometown))});
	tutorial.popFriend();
}

/**
 * This is called to start the process to retrieve a friend's location.  This
 * should be throttled or you'll saturate the server.
 */
tutorial.locateFriend = function (friend) {
	try {
		var friendData = {};
		tutorial.friendMap[friend.id] = friendData;
		friendData["name"]=friend.name;
		console.log("locate friend:"+friend.name);
		console.log(friend.id);
		var h_or_l;
		if (typeof friend.location == 'undefined') {
			h_or_l = friend.hometown;
		} else {
			h_or_l = friend.location;
		}
		if ((h_or_l===null) || (""+h_or_l.id.length==0)) {
			console.log("tutorial.locateFriend:bad value for h or l id! dropping "+ 
					friend.name);
			console.log(h_or_l);
			console.log(friend);
			tutorial.popFriend();
			return;
		}
		FB.api(h_or_l.id, function(response) { tutorial.friendLocation(friend, response)});
	} catch (e) {
		console.log("tutorial.locateFriend failed!");
		console.log(e);
		console.log(friend);
		tutorial.popFriend();
	}
}

/**
 * This is the "handle response" part of getting a friend's location from FB.
 * This ends up calling the server to get the nearby terminals.  If the search
 * for terminals fails, it restarts the processing on the next friend in
 * the queue.
 */
tutorial.friendLocation = function(friend, response) {
	try {
		if (!response) {
			console.log("weird response for "+friend.name+" and aborting");
			tutorial.popFriend();
			return;
		}
		if (response.name.indexOf(",")==-1) {
			console.log("Ignorning: "+friend.name+"->"+response.name + ":" +
				"need a country name to process!");
			tutorial.popFriend();
			return;
		}
		tutorial.friendMap[friend.id]["location"]=response;
		var content = { 
				"name": response.name,
				"lat": response.location.latitude,
				"lon": response.location.longitude
			};
		$.ajax({
			url: "/visit/terminal",
			data: $.param(content), 
			type: "GET",
			dataType: "json",
			success: function (result) {
				tutorial.friendLocationDetails(friend,response, result);
			},
			error: function (request, status, error) {
				console.log("Error processing ajax request:"+status+"("+error+") :"+
						response.name);
				tutorial.popFriend();
			}
		});
		
	} catch (e) {
		console.log("tutorial.friendLocation failed!");
		console.log(e);
		console.log(friend);
		console.log(response);
		tutorial.popFriend();
	}

}

/**
 * This handles getting the terminal responses back from the server.  This is
 * called only in the success case (got the response ok) and then it launches
 * an FB query to load the users icon.
 */
tutorial.friendLocationDetails= function(friend, location, result) {
	
	try {
		tutorial.friendMap[friend.id]["terminals"]=result;
		var onlyOne = true;
	
		console.log("location being considered is "+location.id+","+location.name);
		//we need to know if we need to merge these friends
		if (tutorial.placesSeen.hasOwnProperty(location.id)) {
			onlyOne = false;		
			if (tutorial.placesSeen[location.id].length==1) {
				var previousFriend = tutorial.placesSeen[location.id][0];
				console.log("previous friend at that place was "+previousFriend.name);
				console.log(previousFriend);
				//that friend needs to be converted to a shared marker
				if (tutorial.friendMap[previousFriend.id].hasOwnProperty("marker")) {
					tutorial.friendMap[previousFriend.id]["marker"].setMap(null);
					delete tutorial.friendMap[previousFriend.id]["marker"];
				}
				var coord = new google.maps.LatLng(location.location.latitude, 
						location.location.longitude);
				var m = new google.maps.Marker({
					position: coord,
					shadow: tutorial.pinShadow,
					icon: tutorial.greenMarker,
					map: tutorial.map,
					title: location.name+"\nMultiple friends here.",
					animation: google.maps.Animation.DROP,
					zIndex: tutorial.HIGH_Z,
					visible: !tutorial.itineraryOnScreen
				});	
				console.log("patching up shared marker: "+previousFriend.name+","+m);
				tutorial.friendMap[previousFriend.id]["sharedMarker"]=m;	
				console.log(tutorial.friendMap[previousFriend.id]);
				
				//bind the marker to a click only this time (on create of marker)
				google.maps.event.addListener(m,"click", function(event) {
					tutorial.showMerged(location,m)
				});
				//handle the new friend 
				console.log("assigned new shared marker: "+friend.name+","+m);
				tutorial.friendMap[friend.id]["sharedMarker"]=m;
				console.log(tutorial.friendMap[friend.id]);
			} else {
				//this is the case where we have seen this marker at least two
				//times before so we can just re-use it
				console.log("trying to re-use:---"+tutorial.placesSeen[location.id].length);
				console.log(tutorial.placesSeen[location.id]);
				console.log("first element at the location:");
				console.log(tutorial.placesSeen[location.id][0]);
				var marker = tutorial.placesSeen[location.id][0]["sharedMarker"];
				console.log("reusing shared marker: "+friend.name+","+marker);
				tutorial.friendMap[friend.id]["sharedMarker"]=marker;	
			}
			//update list of people at that marker
			var l = tutorial.placesSeen[location.id].length;
			//subtle: can't use friend on RHS because of the closure machinery
			tutorial.placesSeen[location.id][l]=tutorial.friendMap[friend.id];
		} else {
			//this is the "never seen this before" case... again watching out
			//to make sure we get the updated version on RHS
			tutorial.placesSeen[location.id]= [tutorial.friendMap[friend.id]];
		}
		//if onlyOne is false, the icon won't be dropped on screen... watching 
		//to capture the modified value, not the original friend
		FB.api("/"+friend.id+"/picture?type=square", function(response) { 
			tutorial.friendImage(friend, response, result, onlyOne);});
	} catch (e) {
		console.log("tutorial.friendLocationDetails failed!");
		console.log(e);
		console.log(friend);
		console.log(location);
		console.log(result);
		tutorial.popFriend();
	}
}

/**
 * Display the people that represented by a merged marker. 
 */
tutorial.showMerged = function(location, marker) {
	try {
		var win;
		var id = location.id;
		if (!tutorial.locationToInfoWin.hasOwnProperty(id)) {
			win = new google.maps.InfoWindow({
				maxWidth: 5*54,
			});
			tutorial.locationToInfoWin[id] = win;
		} else {
			win = tutorial.locationToInfoWin[id];
		}
		var i = 0;
		var all = tutorial.placesSeen[location.id];
	
		var div = $("<div>");
		var title = $("<h3>").text(location.name);
		div.append(title);
		while (i < all.length) {
			var f = all[i];
			var img = $("<img>").attr("src", tutorial.friendMap[f.id]["image"]);
			img.css("margin","1px");
			img.attr("title", f.name);
			img.click(function (event) {
				tutorial.launchSearch(f, tutorial.friendMap[f.id]["image"], 
					tutorial.friendMap[f.id]["location"]);
			});

			div.append(img);
			if ((i!=0) && (i%5==0)) {
				div.append($("<br/>"));
			}
			++i;
		}
		win.setContent(div[0]);
		win.open(tutorial.map, marker);
	} catch (e) {
		console.log("tutorial.show merged failed!");
		console.log(e);
		console.log(location);
	}
}

/**
 * This function takes the next friend off the queue and starts it processing.
 * It's called from a number of places, including from some places that
 * handle errors in the procussing of the friend queue (to "go to the next one").
 */
tutorial.popFriend = function() {
	if (tutorial.friendQueue.length>0) {
		var pop = tutorial.friendQueue.splice(tutorial.friendQueue.length-1,1);
		$("div#friendQueue").empty().append(pop[0].name + " ["+tutorial.friendQueue.length+"]");
		tutorial.locateFriend(pop[0]);
	} else {
		$("div#friendQueue").hide();
	}
}

/**
 * Final phase of processing a friend. This gets the friend's picture and 
 * drops the image onto the map.  If there are more friends in the queue
 * it gets the next one started.
 */
tutorial.friendImage= function(friend, result, terminals, needNewIcon) {
	try {
		tutorial.friendMap[friend.id]["image"]=result;
		
		//if you are the only one in this spot...
		if (needNewIcon) {
			var loc = tutorial.friendMap[friend.id]["location"];
			var coord = new google.maps.LatLng(loc.location.latitude, loc.location.longitude);
			var pic = new google.maps.MarkerImage(result);

			var marker = new google.maps.Marker({
				position: coord,
				icon: pic,
				map: tutorial.map,
				title: friend.name+"\n"+loc.name,
				animation: google.maps.Animation.DROP,
				zIndex: tutorial.LOW_Z,
				visible: !tutorial.itineraryOnScreen
			});	
	
			tutorial.friendMap[friend.id]["marker"]=marker;
	
			google.maps.event.addListener(marker,"rightclick", function() {
				tutorial.showMarkerBundle(terminals);
			});
	
			google.maps.event.addListener(marker,"click", function() {
				tutorial.launchSearch(friend, result, tutorial.friendMap[friend.id]["location"]);
			});
		}
	} catch (e) {
		console.log("tutorial.friendImage has failed!");
		console.log(e);
		console.log(friend);
		console.log(result);
		console.log(terminals);
		console.log(needNewIcon);
	}

	console.log("about to pop friend on the normal path:"+friend.name);
	console.log(friend);
	console.log("on the dict");
	console.log(tutorial.friendMap[friend.id]);
	tutorial.popFriend();
}

/**
 * Starts the search procedure by showing the icon of who we are searching for
 * and by starting a request to search with multiple airports.
 */
tutorial.launchSearch = function (friend, result, location) {
	if (tutorial.searchInProgress == true) {
		return;
	}
	tutorial.searchInProgress = true;
	$("div#target").css("background-image","url('"+result+"')");
	$("div#target").off("click");
    tutorial.setTransparencyOfResults(90);
    $("div#items").empty();
    
    var now = new Date();
    var out = new Date(now.getTime()+(1000*60*60*24*tutorial.DAYS_OUT));
    var ret = new Date(now.getTime()+(1000*60*60*24*tutorial.DAYS_BACK));

    var outDate = tutorial.dateOnly(out);
    var retDate = tutorial.dateOnly(ret);

    var content = { 
    		"outbound": outDate,
			"ret": retDate,
			"originLat": tutorial.originLat,
			"originLon": tutorial.originLon,
			"destLat": location.location.latitude,
			"destLon": location.location.longitude,
			"originName": tutorial.originName,
			"destName": location.name,
			"flexDates": "false"
		};
    tutorial.sendPricingRequest(content, "Searching with multiple airports...",
    	function (result) {
			tutorial.tryFlexibleDates(friend, content, result);
    });
};

/**
 * Send stage of processing.  
 */
tutorial.tryFlexibleDates = function(friend, content, result1) {
	console.log("first stage completed for "+friend.name);
	console.log(result1);
	
    content.flexDates = "true";
    
	tutorial.sendPricingRequest(content, "Searching with flexible dates....",
		function (result2) {
			tutorial.searchInProgress = false;
			console.log("in callback:");
			console.log(result2);
			tutorial.displayResults(friend,result1,result2);
	});
}

/**
 * This does the encoding of a request for the server to do a pricing requset.
 */
tutorial.sendPricingRequest = function(content, msg, successFunc) {
	tutorial.displayResultMessage(msg);
	$.ajax({
		url: "/visit/go",
		data: $.param(content), 
		type: "GET",
		dataType: "json",
		success: successFunc,
		error: function (results, status, error) {
			console.log("trapped error");
			console.log(results);
			try {
				var response = JSON.parse(results.responseText).error;
				var pieces = response.split(":");
				tutorial.displayResultMessage(pieces[pieces.length-1]);
			} catch (e) {
				tutorial.displayResultMessage("Timeout erorr?"+e);
			};
			tutorial.searchInProgress = false;
			$("div#target").on("click", function (e) {
				tutorial.clearResults();
			});
		}
	});
}

/**
 * For displaying a big message in the results area.
 */
tutorial.displayResultMessage = function(msgText) {
	$("div#items").empty();
	var h2 = $("<h2>").text(msgText);
	h2.css("margin-top","10px;")
	h2.css("padding-top","25px;")
	$("div#items").append(h2);
}
/**
 * When called, removes the "target friend" and sets the background of the
 * result display are to very transparent.
 */
tutorial.clearResults = function() {
	$("div#target").css("background-image","");
	tutorial.setTransparencyOfResults(50);
	$("div#items").empty();

}

/**
 * If there already are itinerary markers on screen, we get rid of them
 * with this method.
 */
tutorial.hideItinerary = function () {
	//dump old points, if any
	var j = 0;
	while (j < tutorial.itinMarkers.length) {
		tutorial.itinMarkers[j].setMap(null);
		++j;
	}
	tutorial.itinMarkers = [];

	//dump old line, if any
	if (tutorial.itinLine!=null) {
		tutorial.itinLine.setMap(null);
		tutorial.itinLine = null;
	}
}

/**
 * Merge two result lists into one list (in sorted order) with a max size of
 * max.
 */
tutorial.mergeItineraries = function (l1, l2, max) {
	var result = [];
	console.log("sum of sizes is "+l1.length+" and "+l2.length+" = " + (l1.length+l2.length));
	//while we have more to merge...
	while ((l1.length>0) || (l2.length>0)) {
		var choose_l2 = true;
		if ((l1.length===0) || (l2.length===0)) {
			if (l2.length===0) {
				choose_l2=false;
			}
		} else {
			//must pick one of two
			if (l2[0].price>l1[0].price) {
				choose_l2 = false;
			}
		}
		//by here, we know which one we want
		if (choose_l2) {
			result[result.length]=l2.splice(0,1)[0];
		} else {
			result[result.length]=l1.splice(0,1)[0];
		}
		console.log("-----passed through loop:"+choose_l2+" and "+l1.length+","+l2.length+","+result.length);
	}
	console.log("about to do the splice? "+result.length)
	// we are now done, but it might be too big
	if (result.length>max) {
		result.splice(max,result.length-max);
	}
	
	console.log("merged result is size "+result.length);
	console.log(result);
	return result;
}

/**
 * Show an itinerary.  This requires us to know if the itinerary is for
 * outbound or return.
 */
tutorial.showItinerary = function (itin, isOutbound) {
	var i = 0;
	var points = [];
	
	tutorial.hideItinerary();

	var start = 0;
	var stop = itin.lastOut+1;
	
	if (!isOutbound) {
		start = itin.lastOut+1;
		stop = itin.seg.length;
	}
	
	tutorial.setFriendIconVisibility(false);
	
	//drop new markers
	i=start;
	while (i < stop) {
		var seg = itin.seg[i]
		
		destText = seg.carrier + "#" + seg.flight+"  to " + seg.dest;
		
		var markerDest = new google.maps.Marker({
		    position: new google.maps.LatLng(seg.destLat, seg.destLon), 
		    shadow: tutorial.pinShadow,
		    icon: tutorial.redMarker,
		    map: tutorial.map,
		    title: destText,
		    animation: google.maps.Animation.DROP,
		    zIndex: tutorial.HIGH_Z
		  });	

		origText = seg.carrier + "#" + seg.flight+" from " + seg.origin +
		"\nDeparting at " + seg.depTime
		var markerOrig = new google.maps.Marker({
		    position: new google.maps.LatLng(seg.originLat, seg.originLon), 
		    shadow: tutorial.pinShadow,
		    icon: tutorial.redMarker,
		    map: tutorial.map,
		    title: origText,
		    animation: google.maps.Animation.DROP,
		    zIndex: tutorial.HIGH_Z
		  });	
		
		tutorial.itinMarkers[tutorial.itinMarkers.length] = markerOrig;
		tutorial.itinMarkers[tutorial.itinMarkers.length] = markerDest;
		
		points[points.length] = new google.maps.LatLng(seg.originLat,seg.originLon);
		points[points.length] = new google.maps.LatLng(seg.destLat,seg.destLon);
		++i;
	}

	tutorial.itinLine = new google.maps.Polyline({
		geodesic : true,
		clickable : false,
		map: tutorial.map,
		strokeColor: "red",
		strokeWeight: 1,
		strokeOpacity: 0.75,
		path: points,
		zIndex: tutorial.HIGH_Z
	});
	google.maps.event.addListener(tutorial.itinLine,"mouseover", function(event) {
		console.log("mouse over");
		console.log(event);
		tutorial.itinLine.setOptions({
			strokeWeight: 5,
			strokeOpacity: 1.0
		});
	});
	google.maps.event.addListener(tutorial.itinLine,"mouseout", function(event) {
		console.log("mouse out");
		console.log(event);
		tutorial.itinLine.setOptions({
			strokeWeight: 1,
			strokeOpacity: 0.75
		});
	});
};

/**
 * Update the visibility status of friend icons.  Also sets the 
 * itineraryOnScreen property.
 */
tutorial.setFriendIconVisibility = function (displayed) {
	
	tutorial.itineraryOnScreen = !displayed;
	
	for(var key in tutorial.friendMap) {
		if (tutorial.friendMap.hasOwnProperty(key)) {
			var obj = tutorial.friendMap[key];
			console.log("setFriendViz, "+ (obj.hasOwnProperty("marker"))+","+
					(obj.hasOwnProperty("sharedMarker")));
			console.log(obj);
			if (obj.hasOwnProperty("marker")) {
				obj["marker"].setVisible(displayed);
			} else {
				if (obj.hasOwnProperty("sharedMarker")) {
					var m = obj["sharedMarker"];
					if (m.getVisible()!=displayed) {
						m.setVisible(displayed);
					}
				} else {
					//these are people we failed to be able to draw on the map
					/*console.log("can't find marker!");
					console.log(key);
					console.log(obj);*/
				}
			}
		}
	}
}
	
/**
 * Do the dirty work of putting the results on the screen.
 */
tutorial.displayResults = function(friend, airportResults, dateResults) {
	
	console.log("stage 2 results ok for "+friend.name);
	console.log(dateResults);

	var searchResults = tutorial.mergeItineraries(airportResults, dateResults, 6);
	
	
	$("div#target").on("click", function (e) {
		tutorial.clearResults();
		tutorial.setFriendIconVisibility(true);
		tutorial.hideItinerary();
	});
	
	$("div#target").attr("title","Click me to go back to browsing friends!");
	var items = $("div#items");
	items.empty();
	
	items.append($("<span class='titling'>").text("Itineraries:"+friend.name));
	items.append($("<br/>"));
	
	var tbl = $("<table cols='3'>");
	tbl.css("border","0px");
	var tbody = $("<tbody>");
	tbl.append(tbody);
	
	
	var i = 0;
	while (i < searchResults.length) {
		var result = searchResults[i];
		console.log(result);
		var tr = $("<tr>");
		
		var priceCol = $("<td>");
		var span = $("<span class='price'>");
		span.text(result.price + " "+ result.currency);
		priceCol.append(span);
		
		var outboundCol = $("<td>");
		var outLink = $("<span class='itinLink'>").text(result.outboundDate);	
		var destSplit = result.dest.split(",");
		var deets = $("<span class='itinDetails'>");
		deets.text("To "+destSplit[0]);
		outboundCol.append(outLink);
		outboundCol.append(deets);
		
		var returnCol = $("<td>");
		var retLink = $("<span class='itinLink'>").text(result.returnDate)		
		deets = $("<span class='itinDetails'>");
		var originSplit = result.orig.split(",");
		deets.text(" To "+originSplit[0]);
		returnCol.append(deets);
		returnCol.append(retLink);

		tr.append(priceCol);
		tr.append(outboundCol);
		tr.append(returnCol);
		
		tbody.append(tr);
		outLink.click(function () {tutorial.showItinerary(result, true);});
		retLink.click(function () {tutorial.showItinerary(result, false);});
		++i;
	}
	
	items.append(tbl);
}

/**
 * Used to change the transparency of the reults when "in use" versus "not
 * in use."
 */
tutorial.setTransparencyOfResults = function(amount) {
    $("div#results").css("filter", "alpha(opacity="+amount+")");
    var scale = amount / (100.0);
    $("div#results").css("opacity", scale);
};

/**
 * Make a single marker with a given pin color.
 */
tutorial.makeMarker = function(pinColor)  {
	
	var pinImage = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2|" + pinColor,
		    new google.maps.Size(21, 34),
		    new google.maps.Point(0,0),
		    new google.maps.Point(10, 34));
	
	if (!tutorial.pinShadow) {
		tutorial.pinShadow = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_shadow",
		    new google.maps.Size(40, 37),
		    new google.maps.Point(0, 0),
		    new google.maps.Point(12, 35));
	}
	
	return pinImage;
}

/**
 * Figure out the location for the results window.
 */
tutorial.bottomRight = function(selector) {
    var newTop =   $(window).height() - $(selector).height();
    var newLeft = ($(window).width()  - $(selector).width());
    $(selector).css({
        'position': 'absolute',
        'left': newLeft,
        'top': newTop,
    });
}

/**
 * Get a date with only the day month and year.
 */
tutorial.dateOnly = function (d) {
	var year = 1900 + d.getYear();
	var month = d.getMonth() + 1;
	var date = d.getDate();
	
	var m = ""+month;
	if (month<10) {
		m = "0"+month;
	}
	var day = ""+date;
	if (date<10) {
		day = "0"+date;
	}
	
	return year + "-" + m + "-"+day;
	
	
}
