package com.holddie.design.headfirst.decoratorMode03.v1;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 10;
	}
}
