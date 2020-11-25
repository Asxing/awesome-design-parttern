package com.holddie.design.behavior.mediator.demo1;


public abstract class Colleague {
	
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

}
