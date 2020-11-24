package com.holddie.design.behavior.observer.eventBus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LogObserver {

	@Subscribe
	public void handle(String log) {
		System.out.println("LogObserver log : " + log);
	}
}
