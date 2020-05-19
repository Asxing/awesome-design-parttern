package com.holddie.design.headfirst.strategyMode01.v4;

public class RedDuck extends Duck {

	public RedDuck() {
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("duck color is red");
	}
}
