package com.vattima.lego.fulfillment.model.shipstation;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonRootName("orders")
public class OrdersList {
    private List<ShipStationOrder> orders;
}
