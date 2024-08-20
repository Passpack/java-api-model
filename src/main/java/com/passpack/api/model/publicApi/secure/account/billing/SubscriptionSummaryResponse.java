package com.passpack.api.model.publicApi.secure.account.billing;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import com.passpack.api.model.publicApi.secure.account.CustomerSubscriptionSummaryExtract;
import com.passpack.api.model.publicApi.secure.account.NextSubscriptionListEntry;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=false)
public class SubscriptionSummaryResponse extends PasspackResponseObject  {
    private NextSubscriptionListEntry next;
    private CustomerSubscriptionSummaryExtract subscriptionSummary;
}
