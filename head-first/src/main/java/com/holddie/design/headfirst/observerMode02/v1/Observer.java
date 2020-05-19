package com.holddie.design.headfirst.observerMode02.v1;

/**
 * 观察者
 *
 * @author Thomas Yang
 * @version 1.0
 * @date 2020/5/18 4:11 PM
 */
public interface Observer {

	/**
	 * 订阅消息更新
	 *
	 * @param temperature 温度
	 * @param humidity    湿度
	 * @param pressure    压强
	 * @date 2020/5/18  4:13 PM
	 * @author Thomas Yang
	 */
	void update(float temperature, float humidity, float pressure);
}
