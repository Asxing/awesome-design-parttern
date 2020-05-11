package com.holddie.design.headfirst.chapter01.v2;

public abstract class Duck {
	public void quack() {
		System.out.println("duck quack ...");
	}

	public void swim() {
		System.out.println("duck swim ...");
	}

	public abstract void display();

	public void fly() {
		System.out.println("duck fly ...");
	}
}
