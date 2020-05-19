package com.holddie.design.headfirst.decoratorMode03.v1;

public class Espresso extends DarkRoast {
	@Override
	public double cost() {
		return 10.99;
	}

	public Espresso() {
		this.description = "Espresso";
	}
}
