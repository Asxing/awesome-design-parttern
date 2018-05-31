package com.holddie.design.business.impl;

import com.holddie.design.business.IOrderVerify;

/**
 * 订单校验功能实现
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/31 9:59
 */
public class OrderVerifyManager implements IOrderVerify {
    @Override
    public boolean verifyShippingAddress(int pinconde) {
        return false;
    }
}
