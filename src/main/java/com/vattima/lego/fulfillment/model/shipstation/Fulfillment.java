package com.vattima.lego.fulfillment.model.shipstation;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fulfillment {
    private Long fulfillmentId;
    private Long orderId;
    private String orderNumber;
    private String userId;
    private String customerEmail;
    private String trackingNumber;
    private LocalDateTime createDate;
    private LocalDateTime shipDate;
    private LocalDateTime voidDate;
    private LocalDateTime deliveryDate;
    private String carrierCode;
    private String fulfillmentProviderCode;
    private String fulfillmentServiceCode;
    private Double fulfillmentFee;
    private Boolean voidRequested;
    private Boolean voided;
    private Boolean marketplaceNotified;
    private String notifyErrorMessage;
    private Address shipTo;
}
