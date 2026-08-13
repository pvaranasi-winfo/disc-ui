package com.contoso.billing;

import java.math.BigDecimal;

public class PaymentProcessor {

    public BigDecimal calculateTotal(BigDecimal orderTotal, BigDecimal giftCardBalance) {
        // TODO: Implement actual total calculation logic.
        // This is a placeholder fix based on the JIRA ticket description.
        // The original file was not found in the repository.

        if (giftCardBalance == null) {
            System.out.println("WARNING: giftCardBalance is null. Defaulting to zero.");
            giftCardBalance = BigDecimal.ZERO;
        }
        
        // Assuming the original logic was something like:
        // return orderTotal.subtract(giftCardBalance);
        return orderTotal.subtract(giftCardBalance);
    }
}
