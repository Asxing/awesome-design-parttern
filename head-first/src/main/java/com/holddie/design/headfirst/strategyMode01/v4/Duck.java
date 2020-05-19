package com.holddie.design.headfirst.strategyMode01.v4;

public abstract class Duck {
	FlyBehavior flyBehavior;

	public void quack() {
		System.out.println("duck quack ...");
	}

	public void swim() {
		System.out.println("duck swim ...");
	}

	public abstract void display();

	public void fly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
