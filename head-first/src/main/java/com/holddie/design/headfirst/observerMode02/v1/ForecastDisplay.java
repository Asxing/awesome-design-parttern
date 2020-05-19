package com.holddie.design.headfirst.observerMode02.v1;

/**
 * ForecastDisplay展示
 *
 * @author Thomas Yang
 * @version 1.0
 * @date 2020/5/18 4:32 PM
 */
public class ForecastDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("ForecastDisplay: " + temperature + " F and " + humidity + " % and " + pressure + " kpa");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
