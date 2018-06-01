package com.holddie.design.implemention.impl;

import com.holddie.design.implemention.IFolder;

/**
 * real实现
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/1 9:44
 */
public class RealFolder implements IFolder {
    @Override
    public void performOperations() {
        System.out.println("Performing apertion on folder");
    }
}
