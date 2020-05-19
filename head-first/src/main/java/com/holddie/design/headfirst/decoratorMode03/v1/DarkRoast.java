package com.holddie.design.headfirst.decoratorMode03.v1;

public class DarkRoast extends Beverage {
	@Override
	public double cost() {
		return 12;
	}

	public DarkRoast() {
		this.description = "DarkRoast";
	}
}
