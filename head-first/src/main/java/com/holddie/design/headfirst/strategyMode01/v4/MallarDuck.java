package com.holddie.design.headfirst.strategyMode01.v4;

public class MallarDuck extends Duck {

	public MallarDuck() {
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("duck color is green");
	}

	public static void main(String[] args) {
		Duck mallarDuck = new MallarDuck();
		mallarDuck.fly();
		mallarDuck.setFlyBehavior(new FlyNoWay());
		mallarDuck.fly();
	}
}
