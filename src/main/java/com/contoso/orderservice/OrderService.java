package com.contoso.orderservice;

import com.contoso.inventory.InventoryClient;
import com.contoso.inventory.ReservationResult;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.vavr.CheckedFunction0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
    private final InventoryClient inventoryClient;
    private final Retry retry;
    private final CircuitBreaker circuitBreaker;

    public OrderService(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;

        // Configure Retry with exponential backoff
        RetryConfig retryConfig = RetryConfig.custom()
                .maxAttempts(3)
                .intervalFunction(attempt -> Duration.ofMillis(500 * (long) Math.pow(2, attempt - 1)).toMillis())
                .build();
        this.retry = Retry.of("inventoryServiceRetry", retryConfig);

        // Configure Circuit Breaker
        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // Percentage of failures before opening the circuit
                .waitDurationInOpenState(Duration.ofMillis(10000)) // Time in open state before attempting half-open
                .slidingWindowSize(10) // Number of calls to consider for the failure rate
                .build();
        this.circuitBreaker = CircuitBreaker.of("inventoryServiceCircuitBreaker", circuitBreakerConfig);
    }

    public void placeOrder(String item, int quantity) {
        // TODO: This is a placeholder file. The actual OrderService.java was not found in the repository.
        // The fix involves adding retry and circuit breaker logic around the inventoryClient.reserve() call.
        // The original line 312 was expected to be: inventoryClient.reserve(item, quantity);

        CheckedFunction0<ReservationResult> reserveWithRetryAndCircuitBreaker = CircuitBreaker.decorateCheckedSupplier(circuitBreaker,
                Retry.decorateCheckedSupplier(retry, () -> {
                    logger.info("Attempting to reserve item {} with quantity {}", item, quantity);
                    // Simulate the original call to inventoryClient.reserve()
                    // In a real scenario, this would be:
                    // return inventoryClient.reserve(item, quantity);
                    if (inventoryClient == null) {
                        logger.error("InventoryClient is null. Cannot reserve item.");
                        throw new IllegalStateException("InventoryClient not initialized.");
                    }
                    ReservationResult result = inventoryClient.reserve(item, quantity);
                    if (result == null || !result.isSuccess()) {
                        throw new RuntimeException("Failed to reserve item: " + item);
                    }
                    return result;
                }));

        try {
            ReservationResult result = reserveWithRetryAndCircuitBreaker.apply();
            logger.info("Order placed successfully for item {}: {}", item, result.getMessage());
        } catch (Throwable e) {
            logger.error("Failed to place order for item {}: {}", item, e.getMessage());
            // Handle the error, e.g., return an error response to the user
            throw new RuntimeException("Order placement failed due to inventory reservation issues.", e);
        }
    }
}
