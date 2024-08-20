package com.passpack.api.model.publicApi.secure.account;

import lombok.Data;


import java.math.BigDecimal;


@Data
public class NextSubscriptionListEntry  {
    private String action;
    private BigDecimal amount = BigDecimal.ZERO;
    private String sku;
    private String description;
    private boolean isConversionFromLegacyPlan = false;
}
