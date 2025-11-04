package com.vegnet.server.models.v1.future;

import java.util.List;

import com.vegnet.server.models.v1.Customer;
import com.vegnet.server.models.v1.DeliverSchedule;

public class ScheduleDeliveryLine {
    private List<DeliverSchedule> deliveySchedules;
    private Customer customerId;
}
