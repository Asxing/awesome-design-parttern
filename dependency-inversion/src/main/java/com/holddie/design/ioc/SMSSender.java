package com.holddie.design.ioc;

/**
 * 发短信
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:13
 */
public class SMSSender implements INotifier {
    @Override
    public void notify(String message) {
        System.out.println("send sms ....." + message);
    }
}
