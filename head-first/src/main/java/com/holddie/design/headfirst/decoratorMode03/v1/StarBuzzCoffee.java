package com.holddie.design.headfirst.decoratorMode03.v1;

public class StarBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage);


		beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage);

		beverage = new HouseBlend();
		beverage = new Mocha(beverage);
		System.out.println(beverage);
	}
}
