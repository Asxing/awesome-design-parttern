package com.holddie.design.headfirst.observerMode02.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
