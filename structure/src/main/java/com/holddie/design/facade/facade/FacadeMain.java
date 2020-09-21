package com.holddie.design.facade.facade;

import com.holddie.design.facade.business.*;
import com.holddie.design.facade.business.entity.OrderDetails;
import com.holddie.design.facade.business.impl.*;

/**
 * 门面类使用
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/31 10:08
 */
public class FacadeMain {
    private IInventory inventory = new InventoryManager();
    private IOrderVerify orderVerify = new OrderVerifyManager();
    private ICosting costManager = new CostManager();
    private IPaymentGateway paymentGateway = new PaymentGatewayManager();
    private ILogistics logistics = new LogisticsManager();

    public void finalizeOrder(OrderDetails orderDetails) {
        inventory.update(orderDetails.getProductNo());
        orderVerify.verifyShippingAddress(orderDetails.getPinCode());
        orderDetails.setPrice(
                costManager.applyDiscount(
                        orderDetails.getPrice(),
                        orderDetails.getDiscountPercent()
                )
        );
        paymentGateway.verifyCardDetails(orderDetails.getCardNo());
        paymentGateway.processPayment(orderDetails.getCardNo(), orderDetails.getPrice());
        String shippingAddress = String.format("%s, %s - %d",
                orderDetails.getAddressLine1(),
                orderDetails.getAddressLine2(),
                orderDetails.getPinCode());
        logistics.shipProducts(orderDetails.getCardNo(), shippingAddress);
    }
}
