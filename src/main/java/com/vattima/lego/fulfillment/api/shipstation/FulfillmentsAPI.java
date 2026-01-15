package com.vattima.lego.fulfillment.api.shipstation;

import com.vattima.lego.fulfillment.model.shipstation.FulfillmentList;
import feign.RequestLine;

public interface FulfillmentsAPI {
    @RequestLine("GET /fulfillments")
    FulfillmentList getFulfillments();
}
