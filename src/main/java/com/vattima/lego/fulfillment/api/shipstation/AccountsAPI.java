package com.vattima.lego.fulfillment.api.shipstation;

import com.vattima.lego.fulfillment.model.shipstation.Tag;
import feign.RequestLine;

import java.util.List;

public interface AccountsAPI {
    @RequestLine("GET /accounts/listtags")
    List<Tag> listTags();
}
