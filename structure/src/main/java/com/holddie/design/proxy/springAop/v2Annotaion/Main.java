package com.holddie.design.proxy.springAop.v2Annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-auto.xml");
		Tank tank = (Tank) context.getBean("tank");
		tank.move();
	}
}
