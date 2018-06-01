package com.holddie.design;

import com.holddie.design.entity.User;
import com.holddie.design.implemention.impl.ProxyFolder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        User user = new User("bobo", "xyz");
        ProxyFolder proxyFolder = new ProxyFolder(user);

        proxyFolder.performOperations();
        System.out.println("**********************************");
    }
}
