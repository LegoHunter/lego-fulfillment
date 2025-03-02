package com.vattima.lego.fulfillment.model.shipstation;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonRootName("fulfillments")
public class FulfillmentList {
    private List<Fulfillment> fulfillments;
}
