package com.holddie.design.headfirst.observerMode02.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 被订阅天气数据
 *
 * @author Thomas Yang
 * @version 1.0
 * @date 2020/5/18 4:17 PM
 */
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = this.observers.indexOf(observer);
		if (index >= 0) {
			this.observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	private void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
