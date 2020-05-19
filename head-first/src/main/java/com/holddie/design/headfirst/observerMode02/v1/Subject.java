package com.holddie.design.headfirst.observerMode02.v1;


/**
 * 订阅主题
 *
 * @author Thomas Yang
 * @version 1.0
 * @date 2020/5/18 4:08 PM
 */
public interface Subject {
	/**
	 * 添加订阅
	 *
	 * @param observer 观察者
	 * @date 2020/5/18  4:09 PM
	 * @author Thomas Yang
	 */
	void registerObserver(Observer observer);

	/**
	 * 移除订阅
	 *
	 * @param observer 观察者
	 * @date 2020/5/18  4:09 PM
	 * @author Thomas Yang
	 */
	void removeObserver(Observer observer);

	/**
	 * 进行提醒
	 *
	 * @date 2020/5/18  4:10 PM
	 * @author Thomas Yang
	 */
	void notifyObservers();
}
