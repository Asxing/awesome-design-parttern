package com.holddie.design.headfirst.strategyMode01.v4;

public class FlyWithWings implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("duck fly with wings ...");
	}
}
