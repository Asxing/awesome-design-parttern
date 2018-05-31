package com.holddie.design.nofacade;

import com.holddie.design.business.*;
import com.holddie.design.business.entity.OrderDetails;
import com.holddie.design.business.impl.*;

/**
 * 不是使用门面类处理流程
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/31 10:06
 */
public class NoFacadeMain {
    public static void main(String[] args) {
        // Creating the Order/Product details
        OrderDetails orderDetails = new OrderDetails("Java Design Pattern book",
                "Simplified book on design patterns in Java",
                500, 10, "Street No 1", "Educational Area", 1212,
                "8811123456");

        // Updating the inventory.
        IInventory inventory = new InventoryManager();
        inventory.update(orderDetails.getProductNo());

        // verifying various details for the order such as the shipping address.
        IOrderVerify orderVerify = new OrderVerifyManager();
        orderVerify.verifyShippingAddress(orderDetails.getPinCode());

        // Calculating the final cost after applying various discounts.
        ICosting costManager = new CostManager();
        orderDetails.setPrice(
                costManager.applyDiscount(
                        orderDetails.getPrice(),
                        orderDetails.getDiscountPercent()
                )
        );

        // Going through various steps if payment gateway like card verification,
        // charging from the card.
        IPaymentGateway paymentGateway = new PaymentGatewayManager();
        paymentGateway.verifyCardDetails(orderDetails.getCardNo());
        paymentGateway.processPayment(orderDetails.getCardNo(), orderDetails.getPrice());

        // Completing the order by providing logistics.
        ILogistics logistics = new LogisticsManager();
        String shippingAddress = String.format("%s, %s - %d",
                orderDetails.getAddressLine1(),
                orderDetails.getAddressLine2(),
                orderDetails.getPinCode());
        logistics.shipProducts(orderDetails.getProductName(), shippingAddress);
    }
}
