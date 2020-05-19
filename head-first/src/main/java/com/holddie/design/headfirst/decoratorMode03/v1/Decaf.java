package com.holddie.design.headfirst.decoratorMode03.v1;

public class Decaf extends Beverage {
	@Override
	public double cost() {
		return 12.99;
	}

	public Decaf() {
		this.description = "Decaf";
	}
}
