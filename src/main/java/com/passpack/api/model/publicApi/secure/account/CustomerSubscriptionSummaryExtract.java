package com.passpack.api.model.publicApi.secure.account;


import com.passpack.api.model.publicApi.secure.account.billing.AppliedCoupon;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
public class CustomerSubscriptionSummaryExtract  {
    private String subscriptionSku;
    private int subscriptionStatus;
    private String trialEndDate;
    private String subscriptionRenewalDate;
    private String additionalLicenseSku;
    private int additionalLicenseCount;
    private int licensesUsed;
    private int licensesAvailable;
    private int baseLicensesIncluded;
    private int totalLicenseCount;
    private boolean paymentEntered;
    private boolean trialUpgrade;
    private String trialPreviousPlanName;
    private String discountName;
    private BigDecimal discount = BigDecimal.ZERO;
    private boolean expired = false;
    private String status;
    private boolean trialing = false;
    private String description;
    private BigDecimal amount = BigDecimal.ZERO;
    private BigDecimal discountedAmount = BigDecimal.ZERO;
    private BigDecimal amountPerUser = BigDecimal.ZERO;
    private boolean businessTrialAvailable = false;
    private List<AppliedCoupon> appliedCoupons = new ArrayList<>();
}
