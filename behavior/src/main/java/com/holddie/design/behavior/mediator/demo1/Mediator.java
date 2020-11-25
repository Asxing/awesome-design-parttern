package com.holddie.design.behavior.mediator.demo1;

public abstract class Mediator {
	
	//抽象的发送消息方法
	public abstract void send(String message, Colleague colleague);
	
}
