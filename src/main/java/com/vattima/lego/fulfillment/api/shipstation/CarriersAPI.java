package com.vattima.lego.fulfillment.api.shipstation;

import com.vattima.lego.fulfillment.model.shipstation.Carrier;
import com.vattima.lego.fulfillment.model.shipstation.Service;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CarriersAPI {
    @RequestLine("GET /carriers")
    List<Carrier> getCarriers();

    @RequestLine("GET /carriers/getcarrier?carrierCode={carrierCode}")
    Carrier getCarrier(@Param("carrierCode") String carrierCode);

    @RequestLine("GET /carriers/listpackages?carrierCode={carrierCode}")
    List<Package> getPackages(@Param("carrierCode") String carrierCode);

    @RequestLine("GET /carriers/listservices?carrierCode={carrierCode}")
    List<Service> getServices(@Param("carrierCode") String carrierCode);
}
