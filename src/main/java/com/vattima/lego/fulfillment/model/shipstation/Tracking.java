package com.vattima.lego.fulfillment.model.shipstation;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vattima.lego.fulfillment.util.DateUtils;
import lombok.*;

import java.net.URL;
import java.time.ZonedDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tracking {
    private String trackingNumber;
    private URL trackingURL;
    @JsonDeserialize(using = DateUtils.ZonedDateTimeDeserializer.class)
    private ZonedDateTime dateShipped;
}
