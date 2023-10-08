package com.noma.weatherforecast.data

data class WeatherResponse(

    var coord :Coord,
    var weather: List<Weather>,
    var base:String,
    var main:Main,
    var visibility:Long,
    var dt:Long

)

data class Coord(
    var lon:Double,
    var lat:Double
)

data class Weather(
var id:Long,
    var main:String,
    var description:String,
    var icon:String
)

data class Main(
    var item:Double
)


//
//{"coord":
//    {"lon":32.5822,"lat":0.3163},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"base":"stations","main":{"temp":302.61,"feels_like":302.24,"temp_min":302.61,"temp_max":302.61,"pressure":1010,"humidity":40,"sea_level":1010,"grnd_level":882},"visibility":10000,"wind":{"speed":3.26,"deg":174,"gust":3.56},"clouds":{"all":81},"dt":1696244028,"sys":{"country":"UG","sunrise":1696217751,"sunset":1696261341},"timezone":10800,"id":232422,"name":"Kampala","cod":200}
