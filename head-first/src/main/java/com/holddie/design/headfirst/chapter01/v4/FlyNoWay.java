package com.holddie.design.headfirst.chapter01.v4;

public class FlyNoWay implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("duck can not  fly ...");
	}
}
