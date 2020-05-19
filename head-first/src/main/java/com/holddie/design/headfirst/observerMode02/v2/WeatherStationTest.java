package com.holddie.design.headfirst.observerMode02.v2;


public class WeatherStationTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(70.4f, 12.3f, 23.32f);
		weatherData.setMeasurements(170.4f, 1112.3f, 123.32f);
	}
}
