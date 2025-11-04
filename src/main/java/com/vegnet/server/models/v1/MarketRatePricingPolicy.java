package com.vegnet.server.models.v1;

import java.util.Date;

// this object needs to be updated and saved every single day.
// select * from MarketRatePricingPolicy where vegetable=vegetebleId sort by date desc;
public class MarketRatePricingPolicy {
    private  Vegetable vegetable;
    private  double todayMarketRatePerKg;
    private Date todayPricedDate;

}
