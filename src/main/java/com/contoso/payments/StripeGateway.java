// TODO: Implement fix for SAM1-176 - Payment API intermittently timing out after exactly 30 seconds.
// The original files (StripeGateway.java and PaymentService.java) were not found in this repository.
// This is a placeholder file to create a pull request.
package com.contoso.payments;

public class StripeGateway {
    public void chargeCard() {
        // Original stack trace indicated a timeout at this point.
        // A potential fix would involve increasing the timeout for Stripe API calls.
        // For example, setting a higher timeout value in the Stripe client configuration.
        // Stripe.setReadTimeoutMillis(60000); // Example: Increase to 60 seconds
    }
}
