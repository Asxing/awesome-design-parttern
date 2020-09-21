package com.holddie.design.decorator;


import com.holddie.design.decorator.component.BakeryComponent;
import com.holddie.design.decorator.concretecomponent.CakeBase;
import com.holddie.design.decorator.concretecomponent.PastryBase;
import com.holddie.design.decorator.concretedecorator.ArtificialScentDecorator;
import com.holddie.design.decorator.concretedecorator.CherryDecorator;
import com.holddie.design.decorator.concretedecorator.CreamDecorator;
import com.holddie.design.decorator.concretedecorator.NameCardDecorator;

/**
 * Hello world!
 */
public class App {

    private static void printProductDetails(BakeryComponent bakeryComponent) {
        String out = "Item: " + bakeryComponent.getName() + ", Price: " + bakeryComponent.getPrice();
        System.out.println(out);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        CakeBase cakeBase = new CakeBase();
        printProductDetails(cakeBase);

        CreamDecorator creamDecorator = new CreamDecorator(cakeBase);
        printProductDetails(creamDecorator);

        CherryDecorator cherryDecorator = new CherryDecorator(creamDecorator);
        printProductDetails(cherryDecorator);

        ArtificialScentDecorator artificialScentDecorator = new ArtificialScentDecorator(cherryDecorator);
        printProductDetails(artificialScentDecorator);

        NameCardDecorator nameCardDecorator = new NameCardDecorator(artificialScentDecorator);
        printProductDetails(nameCardDecorator);

        PastryBase pastry = new PastryBase();
        printProductDetails(pastry);

        CreamDecorator creamDecorator1 = new CreamDecorator(pastry);
        printProductDetails(creamDecorator1);

    }
}
