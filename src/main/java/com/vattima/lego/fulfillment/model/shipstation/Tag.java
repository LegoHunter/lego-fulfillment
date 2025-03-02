package com.vattima.lego.fulfillment.model.shipstation;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tag {
    private Integer tagId;
    private String name;
    private String color;
}
