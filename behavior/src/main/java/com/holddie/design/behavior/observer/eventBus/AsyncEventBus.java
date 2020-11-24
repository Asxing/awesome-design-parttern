package com.holddie.design.behavior.observer.eventBus;

import java.util.concurrent.Executor;

public class AsyncEventBus extends EventBus {
	public AsyncEventBus(Executor executor) {
		super(executor);
	}
}
