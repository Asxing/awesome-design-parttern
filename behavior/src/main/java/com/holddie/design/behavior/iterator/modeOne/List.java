package com.holddie.design.behavior.iterator.modeOne;


public interface List<E> {
	void add(E obj);

	void remove(E obj);

	Iterator iterator();
}
