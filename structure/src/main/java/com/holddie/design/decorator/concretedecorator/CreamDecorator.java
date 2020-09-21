package com.holddie.design.decorator.concretedecorator;


import com.holddie.design.decorator.component.BakeryComponent;
import com.holddie.design.decorator.decorator.Decorator;

/**
 * 奶油功能装饰
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/30 9:53
 */
public class CreamDecorator extends Decorator {
    public CreamDecorator(BakeryComponent bakeryComponent) {
        super(bakeryComponent);
        this.name = "Cream";
        this.price = 1.0;
    }
}
