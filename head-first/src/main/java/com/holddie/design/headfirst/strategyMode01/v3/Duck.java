package com.holddie.design.headfirst.strategyMode01.v3;

public abstract class Duck {
	public void quack() {
		System.out.println("duck quack ...");
	}

	public void swim() {
		System.out.println("duck swim ...");
	}

	public abstract void display();

}
