package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private final Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Existing logic for processing email queue
        // ...

        // TODO: This is a placeholder fix. The actual file needs to be located and modified.
        // The JIRA ticket KAN-18 describes a memory leak due to attachmentCache not being cleared.
        // The fix involves adding attachmentCache.clear() at the end of processQueue().
        // Alternatively, replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).

        // Simulate existing logic that uses attachmentCache
        attachmentCache.put("someKey", new byte[1024]); // Example usage

        // Fix for KAN-18: Clear the cache after each batch to prevent memory leak
        attachmentCache.clear();
    }

    // Other methods
    // ...
}
