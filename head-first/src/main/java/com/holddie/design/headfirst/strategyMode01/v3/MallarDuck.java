package com.holddie.design.headfirst.strategyMode01.v3;

public class MallarDuck extends Duck implements Flyable {

	@Override
	public void display() {
		System.out.println("duck color is green");
	}

	@Override
	public void fly() {
		System.out.println("Mallar duck fly ...");
	}
}
