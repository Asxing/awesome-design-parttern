package com.holddie.design.ioc;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:02
 */
public class EventLogWriter implements INotifier {

    @Override
    public void notify(String message) {
        System.out.println("write to event log, message : " + message);
    }
}
