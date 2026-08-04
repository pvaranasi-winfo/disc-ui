package com.contoso.orderservice;

import com.contoso.inventoryclient.InventoryClient;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.function.Supplier;

@Service
public class OrderService {

    private final InventoryClient inventoryClient;
    private final Retry retry;
    private final CircuitBreaker circuitBreaker;

    public OrderService(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;

        // Configure Retry with exponential backoff
        RetryConfig retryConfig = RetryConfig.custom()
                .maxAttempts(3)
                .intervalFunction(attempt -> Duration.ofMillis(500 * (long) Math.pow(2, attempt - 1))) // Exponential backoff
                .build();
        this.retry = Retry.of("inventoryReserveRetry", retryConfig);

        // Configure Circuit Breaker
        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // 50% failure rate to open the circuit
                .waitDurationInOpenState(Duration.ofSeconds(60)) // 60 seconds in open state
                .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
                .slidingWindowSize(10) // Evaluate last 10 calls
                .build();
        this.circuitBreaker = CircuitBreaker.of("inventoryReserveCircuitBreaker", circuitBreakerConfig);
    }

    public void placeOrder(String orderDetails) {
        // Existing order placement logic...

        // Apply retry and circuit breaker to inventoryClient.reserve()
        Supplier<Boolean> reserveSupplier = CircuitBreaker.decorateSupplier(circuitBreaker,
                Retry.decorateSupplier(retry, () -> {
                    // Simulate the original call at line 312
                    // Add null check as per the JIRA ticket description
                    if (inventoryClient == null) {
                        throw new IllegalStateException("InventoryClient is null");
                    }
                    return inventoryClient.reserve();
                }));

        try {
            boolean reserved = reserveSupplier.get();
            if (!reserved) {
                // Handle reservation failure
                System.err.println("Failed to reserve inventory for order: " + orderDetails);
            }
        } catch (Exception e) {
            System.err.println("Error during inventory reservation for order: " + orderDetails + " - " + e.getMessage());
            // Further error handling, e.g., throw custom exception, log, etc.
        }

        // Remaining order placement logic...
    }
}

// Placeholder for InventoryClient, assuming it exists elsewhere
class InventoryClient {
    public boolean reserve() {
        // Simulate connection refusal for testing purposes
        // throw new JedisConnectionException("Failed to connect to inventory-cache-prod-01:6379 - Connection refused");
        return Math.random() > 0.5; // Simulate success/failure
    }
}
