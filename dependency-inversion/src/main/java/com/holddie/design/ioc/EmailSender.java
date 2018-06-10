package com.holddie.design.ioc;

/**
 * 发邮件
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/10 20:14
 */
public class EmailSender implements INotifier {
    @Override
    public void notify(String message) {
        System.out.println("Email send .... " + message);
    }
}
