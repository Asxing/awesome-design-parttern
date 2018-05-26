package com.holddie.design;

import com.holddie.design.fluent.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        User user = new User.UserBuilder("hold", "die")
                .address("123")
                .age(18)
                .builder();

        System.out.println(user);
    }
}
