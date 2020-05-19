package com.holddie.design.headfirst.observerMode02.v1;

/**
 * 当前天气情况展示
 *
 * @author Thomas Yang
 * @version 1.0
 * @date 2020/5/18 4:32 PM
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("CurrentConditionDisplay: " + temperature + " F and " + humidity + " % and " + pressure + " kpa");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
