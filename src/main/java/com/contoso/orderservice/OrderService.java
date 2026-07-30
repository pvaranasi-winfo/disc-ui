package com.contoso.orderservice;

import com.contoso.inventory.InventoryClient;
import com.contoso.order.Order;

public class OrderService {

    private InventoryClient inventoryClient;

    public OrderService(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;
    }

    public void placeOrder(Order order) {
        // TODO: Add retry with exponential backoff (3 retries, 500ms base) + circuit breaker
        // around inventoryClient.reserve() to handle JedisConnectionException.
        // Original line 312: inventoryClient.reserve(order.getProductId(), order.getQuantity());
        inventoryClient.reserve(order.getProductId(), order.getQuantity());
    }
}
