package com.holddie.design.ioc;

/**
 * 使用依赖倒置
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:07
 */
public class AppMonitorIOC {


    private INotifier notifier = null;

    private void notify(String message) {
        if (notifier == null) {
            notifier = new EventLogWriter();
        }
        notifier.notify(message);
    }

    public static void main(String[] args) {
        AppMonitorIOC appMonitorIOC = new AppMonitorIOC();
        appMonitorIOC.notify("App has a problem ...");
    }

}
