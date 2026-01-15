package com.vattima.lego.fulfillment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {
    private String code;
    private String name;
    @JsonProperty("alternate-codes")
    private List<String> alternateCodes;
    public boolean hasCode(String code) {
        return this.code.equalsIgnoreCase(code) || Optional.ofNullable(alternateCodes).map(l -> l.contains(code)).orElse(false);
    }
}
