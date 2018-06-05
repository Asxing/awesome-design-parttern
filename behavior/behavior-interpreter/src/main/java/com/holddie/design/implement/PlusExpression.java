package com.holddie.design.implement;

import com.holddie.design.abs.AbstractExpression;

/**
 * 加运算符
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/5 9:24
 */
public class PlusExpression extends AbstractExpression {

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public PlusExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
