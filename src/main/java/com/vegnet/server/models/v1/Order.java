package com.vegnet.server.models.v1;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long orderId;
    // better to use a vegnet user id here,
    // farmer also can order differnet items for themselves
    private Long customerId;
    
    // supplied by AI, can extract address from the customerId as well,
    // under what conditions, we should copy values and place it in another class/object and prevent reference
    private Address shippingAddress;
    private LocalDateTime scheduledDeliveryTime;
    private Long deliveryRiderId;
    
    private double subtotal; 
    private double taxAmount;
    private double deliveryFee;
    private double orderTotal;
    private OrderStatus status;
    private Long sourceDeliveryScheduleId;

    // the contents
    private List<OrderItem> vegetablesOrders;
}
