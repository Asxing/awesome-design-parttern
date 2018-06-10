package com.holddie.design.nodip;

/**
 * 没有使用DIP
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:01
 */
public class AppMonitorNoDIP {

    // 负责将时间日志写到日志系统中
    private EventLogWriter writer = null;

    private void notify(String message) {
        if (writer == null) {
            writer = new EventLogWriter();
        }
        writer.write(message);
    }

    public static void main(String[] args) {
        AppMonitorNoDIP appMonitorNoDIP = new AppMonitorNoDIP();
        appMonitorNoDIP.notify("App has a problem ...");
    }

}

class EventLogWriter {
    void write(String message) {
        System.out.println("write to event log, message : " + message);
    }
}


