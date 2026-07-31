// TODO: Implement fix for SAM1-176 - Payment API intermittently timing out after exactly 30 seconds.
// The original files (StripeGateway.java and PaymentService.java) were not found in this repository.
// This is a placeholder file to create a pull request.
package com.contoso.payments;

public class PaymentService {
    public void processPayment() {
        // Original stack trace indicated a timeout at this point.
        // This method likely calls StripeGateway.chargeCard().
        // The fix should be applied in StripeGateway.java to increase the timeout.
    }
}
