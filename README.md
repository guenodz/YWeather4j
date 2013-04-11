YWeather4j
==========

YWeather4j is a Yahoo Weather API Wrapper for Java.

Code Example to get Weather Information

YWeather weather = new YWeather();

WeatherInfo info = weather.getWeatherForPlace("Algiers", Units.TEMP_C);

System.out.println(info.getItem().getForecastOne().toString());

(c) 2013 Guendouz Mohamed 

