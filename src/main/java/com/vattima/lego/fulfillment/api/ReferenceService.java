package com.vattima.lego.fulfillment.api;

import com.vattima.lego.fulfillment.exception.FulfillmentException;
import com.vattima.lego.fulfillment.model.Country;

import java.util.Map;

public interface ReferenceService {
    Map<String, Country> getAllCountries();

    boolean isDomestic(Country country);

    default boolean isInternational(Country country) {
        return !isDomestic(country);
    }

    default Country lookupCountry(String code) {
        return getAllCountries().values()
                .stream()
                .filter(c -> c.hasCode(code))
                .findFirst()
                .orElseThrow(() -> new FulfillmentException("Country code [%s] not found".formatted(code)));
    }
}
