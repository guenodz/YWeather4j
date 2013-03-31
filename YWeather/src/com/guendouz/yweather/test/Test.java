package com.guendouz.yweather.test;

import com.guendouz.yweather.YWeather;
import com.guendouz.yweather.model.Units;
import com.guendouz.yweather.model.WeatherInfo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		YWeather weather = new YWeather();
		WeatherInfo info = weather.getWeatherForWOEID("2442047", Units.TEMP_C);
		System.err.println(info.getItem().getForecastOne().getDay());
		info = weather.getWeatherForPlace("Lile", Units.TEMP_C);
		System.out.println(info.getItem().getCondtition().getIconUrl());

	}

}
