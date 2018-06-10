package com.holddie.design.injection;

import com.holddie.design.ioc.EventLogWriter;
import com.holddie.design.ioc.INotifier;

/**
 * 构造函数注入
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:16
 */
public class AppMonitorConstrctorInjection {

    private INotifier notifier = null;

    private AppMonitorConstrctorInjection(INotifier notifier) {
        this.notifier = notifier;
    }

    private void notify(String message) {
        notifier.notify(message);
    }

    public static void main(String[] args) {
        EventLogWriter writer = new EventLogWriter();
        AppMonitorConstrctorInjection monitor = new AppMonitorConstrctorInjection(writer);
        monitor.notify("App has a problem ...");
    }

}
