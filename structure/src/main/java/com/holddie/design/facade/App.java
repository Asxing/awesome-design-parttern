package com.holddie.design.facade;


import com.holddie.design.facade.business.entity.OrderDetails;
import com.holddie.design.facade.facade.FacadeMain;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Creating the Order/Product details
        OrderDetails orderDetails = new OrderDetails("Java Design Pattern book",
                "Simplified book on design patterns in Java",
                500, 10, "Street No 1", "Educational Area", 1212,
                "8811123456");

        // Using Facade
        FacadeMain facade = new FacadeMain();
        facade.finalizeOrder(orderDetails);
    }
}
