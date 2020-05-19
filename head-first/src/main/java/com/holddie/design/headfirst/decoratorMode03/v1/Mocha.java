package com.holddie.design.headfirst.decoratorMode03.v1;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 11 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
}
