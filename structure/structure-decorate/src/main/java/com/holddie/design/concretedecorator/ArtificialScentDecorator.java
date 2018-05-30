package com.holddie.design.concretedecorator;

import com.holddie.design.component.BakeryComponent;
import com.holddie.design.decorator.Decorator;

/**
 * 手工费
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/30 9:55
 */
public class ArtificialScentDecorator extends Decorator {
    public ArtificialScentDecorator(BakeryComponent bakeryComponent) {
        super(bakeryComponent);
        this.name = "ArtificialScent";
        this.price = 3.0;
    }
}
