package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private final Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // TODO: Implement actual queue processing logic here.
        // The JIRA ticket KAN-15 indicates a memory leak due to attachmentCache not being cleared.
        // Add attachmentCache.clear() at the end of this method, or replace with a Caffeine bounded LRU cache.
        // For now, adding a placeholder for the fix.
        attachmentCache.clear(); // Placeholder for the fix as per KAN-15
    }
}
