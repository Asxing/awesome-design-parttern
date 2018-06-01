package com.holddie.design.implemention.impl;

import com.holddie.design.entity.User;
import com.holddie.design.implemention.IFolder;

/**
 * 代理实现
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/1 9:45
 */
public class ProxyFolder implements IFolder {

    User user;
    RealFolder realFolder;

    public ProxyFolder(User user) {
        this.user = user;
    }

    @Override
    public void performOperations() {
        if (user.getUsername().equals("bobo") && user.getPassword().equals("xyz")) {
            realFolder = new RealFolder();
            realFolder.performOperations();
        } else {
            System.out.println("you don`t have access to this folder");
        }
    }
}
