package com.holddie.design.headfirst.observerMode02.v2;

import com.holddie.design.headfirst.observerMode02.v1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Observable observable;

	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("version 2 - CurrentConditionDisplay: " + temperature + " F and " + humidity + " % and " + pressure + " kpa");
	}
}
