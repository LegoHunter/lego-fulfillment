package com.vattima.lego.fulfillment.model.shipstation;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Carrier {
    private String name;
    private String code;
    private String accountNumber;
    private boolean requiresFundedAccount;
    private Double balance;
    private String nickname;
    private Long shippingProviderId;
    private Boolean primary;
}
