package com.holddie.design.proxy.staticProxy;

public class Main {
	public static void main(String[] args) {
		Tank tank = new Tank();
		TankTimeProxy tankTimeProxy = new TankTimeProxy(tank);
		TankLogProxy tankLogProxy = new TankLogProxy(tankTimeProxy);
		tankLogProxy.move();
	}
}
