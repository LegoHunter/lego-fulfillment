package com.vattima.lego.fulfillment.model.shipstation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShipStationResource<T> {
    private T data;
}
