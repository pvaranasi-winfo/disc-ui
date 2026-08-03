/*
TODO: Implement fix for SAM1-176. Payment API intermittently timing out after exactly 30 seconds — affecting 8% of EU transactions.

Root Cause: eu-relay v1.9.2 changed TLS keep-alive settings on 2024-06-10.

Stack trace:
  StripeException: Read timed out after 30000ms
  at com.contoso.payments.StripeGateway.chargeCard(StripeGateway.java:134)
  at com.contoso.payments.PaymentService.processPayment(PaymentService.java:78)

Workaround: timeout increased to 60s reduces failures to ~1%.
*/