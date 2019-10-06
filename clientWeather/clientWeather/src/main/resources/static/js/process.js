function getInformation() {

    var city = $("#city").val();
    var id = $("#cityid").val();



    if (city.trim() == "" && id.trim()=="") {
        alert("Please provide a City Name or a City Id...");
        return;
    }

    var lat = 0;
    var lng = 0;

    if(city.length>0){
        $.ajax({
            type: "GET",
            async:false,
            contentType: "application/json; charset=utf-8",
            url: "http://localhost:8090/iKnowWeather/api/getbycity/" + city,
            success: function (data, textStatus, xhr) {

                lat = data.coordObject.lat;
                lng =data.coordObject.lon ;
                $("#temp").text(data.main.temp+" °C");
                $("#max").text(data.main.temp_max+" °C");
                $("#weather1").text(data.weather[0].main+": "+data.weather[0].description);
                $("#wind").text(data.wind.speed);

            } ,error: function (jqXHR, textStatus, errorThrown) {
                window.location = '/iClient/notfound';
            }
        });
    }
    if(id.length>0){
        $.ajax({
            type: "GET",
            async:false,
            contentType: "application/json; charset=utf-8",
            url: "http://localhost:8090/iKnowWeather/api/getbyid/" + id,
            success: function (data, textStatus, xhr) {

                lat = data.coordObject.lat;
                lng =data.coordObject.lon ;

                $("#temp").text(data.main.temp+" °C");
                $("#max").text(data.main.temp_max+" °C");
                $("#weather1").text(data.weather[0].main+": "+data.weather[0].description);
                $("#wind").text(data.wind.speed);

            } ,error: function (jqXHR, textStatus, errorThrown) {
                window.location = '/iClient/notfound';
            }
        });
    }



    if (lat == undefined && lng == undefined) {
        alert("City not found...");
        return;
    }


     var map = new google.maps.Map(document.getElementById('map'), {
        zoom: 2,
         center: new google.maps.LatLng(lat, lng),
         mapTypeId: google.maps.MapTypeId.ROADMAP
     });
    var myLatLng = {lat: lat, lng: long};

    var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        title: city,
        icon:{
            url: "http://maps.google.com/mapfiles/ms/icons/green-dot.png"
        }
    });
    marker.setMap(map);

}
function getBylocation(){
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        alert("Geolocation is not supported by this browser.");
    }

}
function showPosition(position) {


    $.ajax({
        type: "GET",
        async:false,
        contentType: "application/json; charset=utf-8",
        url: "http://localhost:8090/iKnowWeather/api/getbycoord/" + position.coords.latitude+"/"+position.coords.longitude,
        success: function (data, textStatus, xhr) {

            lat = data.coordObject.lat;
            lng =data.coordObject.lon ;

            $("#temp").text(data.main.temp+" °C");
            $("#max").text(data.main.temp_max+" °C");
            $("#weather1").text(data.weather[0].main+": "+data.weather[0].description);
            $("#wind").text(data.wind.speed);

        } ,error: function (jqXHR, textStatus, errorThrown) {
            window.location = '/iClient/notfound';
        }
    });

    var map = new google.maps.Map(document.getElementById('map'), {
        zoom: 8,
        center: new google.maps.LatLng(position.coords.latitude, position.coords.longitude),
        mapTypeId: google.maps.MapTypeId.ROADMAP
    });
    var myLatLng = {lat: position.coords.latitude, lng: position.coords.longitude};

    var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        title: "This your Current Location",
        icon:{
            url: "http://maps.google.com/mapfiles/ms/icons/green-dot.png"
        }
    });
    marker.setMap(map);
}
