package com.holddie.design.concretedecorator;

import com.holddie.design.component.BakeryComponent;
import com.holddie.design.decorator.Decorator;

/**
 * 名片功能费用
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/30 9:56
 */
public class NameCardDecorator extends Decorator {
    public NameCardDecorator(BakeryComponent bakeryComponent) {
        super(bakeryComponent);
        this.name = "NameCard";
        this.price = 4.0;
    }
}
