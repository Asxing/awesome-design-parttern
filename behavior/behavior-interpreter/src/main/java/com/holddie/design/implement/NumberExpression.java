package com.holddie.design.implement;

import com.holddie.design.abs.AbstractExpression;

/**
 * 数字表达式
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/5 9:21
 */
public class NumberExpression extends AbstractExpression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}
