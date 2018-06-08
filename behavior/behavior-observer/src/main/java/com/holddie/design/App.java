package com.holddie.design;

import com.holddie.design.observer.Follower;
import com.holddie.design.subject.OfficalAccount;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        OfficalAccount officalAccount = new OfficalAccount("bobo");

        Follower mark = new Follower("mark");
        Follower jack = new Follower("jack");
        Follower erick = new Follower("erick");

        officalAccount.register(mark);
        officalAccount.register(jack);
        officalAccount.register(erick);

        officalAccount.pushArticle("i am xiaozhu  peiqi !");

    }
}
