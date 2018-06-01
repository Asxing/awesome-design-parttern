package com.holddie.design.entity;

import lombok.Data;

/**
 * User用户
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/1 9:41
 */
@Data
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
