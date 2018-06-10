package com.holddie.design.injection;

import com.holddie.design.ioc.EventLogWriter;
import com.holddie.design.ioc.INotifier;

/**
 * setter 注入
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:19
 */
public class AppMonitorSetterInjection {

    private INotifier notifier = null;

    private void setNotifier(INotifier notifier) {
        this.notifier = notifier;
    }

    private void notify(String message) {
        notifier.notify(message);
    }

    public static void main(String[] args) {
        EventLogWriter writer = new EventLogWriter();
        AppMonitorSetterInjection monitor = new AppMonitorSetterInjection();
        monitor.setNotifier(writer);
        monitor.notify("App has a problem ...");
    }

}
