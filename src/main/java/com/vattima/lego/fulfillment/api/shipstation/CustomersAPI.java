package com.vattima.lego.fulfillment.api.shipstation;

import com.vattima.lego.fulfillment.model.shipstation.Customer;
import com.vattima.lego.fulfillment.model.shipstation.CustomersList;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.Map;

public interface CustomersAPI {
    @RequestLine("GET /customers?stateCode={stateCode}&countryCode={countryCode}&tagId={tagId}&marketplaceId={marketplaceId}&sortBy={sortBy}&sortDir={sortDir}&page={page}&pageSize={pageSize}")
    CustomersList getCustomers(@QueryMap Map<String, Object> params);

    @RequestLine("GET /customers/{customerId}")
    Customer getCustomer(@Param("customerId") Long customerId);
}
