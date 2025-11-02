package com.vegnet.server.models.v1;

public class DeliverStatus {
    private DeliveryStatusEnum deliveryStatusEnum;
    private String statusDescription;

    public static enum DeliveryStatusEnum {
        PROCESSING, PACKED, OUT_FOR_DELIVERY, DELIVERED
    }

}
