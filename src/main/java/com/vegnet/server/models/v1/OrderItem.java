package com.vegnet.server.models.v1;

public class OrderItem {
    private Long orderItemId;
    private FarmInventory farmInventory;
    private Vegetable vegetableId;
    private double totalWeight;
    private MarketRatePricingPolicy pricingPolicy;
    // the DeliverySchedule contains date and other information
    // contains the date at which it must be delivered to the customer
    private DeliverSchedule deliverSchedule;

    // 
}
