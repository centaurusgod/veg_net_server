package com.vegnet.server.models.v1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FarmInventory {
    private Long inventoryId;
    private Farm farm;
    private Vegetable vegetable;
    private double availableStockWeight;
    private boolean isAvailable;
}
