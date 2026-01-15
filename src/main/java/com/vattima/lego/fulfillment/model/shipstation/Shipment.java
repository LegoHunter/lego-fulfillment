package com.vattima.lego.fulfillment.model.shipstation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vattima.lego.fulfillment.util.DateUtils;
import lombok.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Shipment {
    private Long fulfillmentId;
    private Long orderId;
    private String orderNumber;
    private String userId;
    private String customerEmail;
    private String trackingNumber;
    private LocalDateTime createDate;
    private Date shipDate;
    private LocalDateTime voidDate;
    @JsonDeserialize(using = DateUtils.ZonedDateTimeDeserializer.class)
    @JsonSerialize(using = DateUtils.ZonedDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS", timezone = "UTC")
    private ZonedDateTime deliveryDate;
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
