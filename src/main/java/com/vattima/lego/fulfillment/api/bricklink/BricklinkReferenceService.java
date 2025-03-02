package com.vattima.lego.fulfillment.api.bricklink;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vattima.lego.fulfillment.api.ReferenceService;
import com.vattima.lego.fulfillment.configuration.ReferenceProperties;
import com.vattima.lego.fulfillment.exception.FulfillmentException;
import com.vattima.lego.fulfillment.model.Country;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
public class BricklinkReferenceService implements ReferenceService {
    private final ReferenceProperties referenceProperties;
    private final ObjectMapper objectMapper;
    private Map<String, Country> countries;

    @Override
    public Map<String, Country> getAllCountries() {
        return Optional.ofNullable(countries)
                .orElseGet(() -> {
                    try {
                        List<Country> countryList = objectMapper.readValue(this.getClass()
                                .getClassLoader()
                                .getResourceAsStream(referenceProperties.getStaticReference()
                                        .getCountry()), new TypeReference<List<Country>>() {
                        });
                        countries = countryList.stream()
                                .collect(Collectors.toMap(Country::getCode, Function.identity()));
                        return countries;
                    } catch (IOException e) {
                        throw new FulfillmentException(e);
                    }
                });
    }

    @Override
    public boolean isDomestic(Country country) {
        return Optional.ofNullable(country)
                .filter(c -> "US".equalsIgnoreCase(c.getCode()))
                .isPresent();
    }
}
