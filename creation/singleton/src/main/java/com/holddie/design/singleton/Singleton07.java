package com.holddie.design.singleton;

/**
 * 枚举单例
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/24 10:16
 */
public enum Singleton07 {
    INSTANCE;

    public void method() {
        System.out.println("singleton method call...");
    }
}


class TestEnumSingleton{
    public static void main(String[] args) {
        Singleton07.INSTANCE.method();
    }
}