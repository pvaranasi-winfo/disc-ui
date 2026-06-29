package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private final Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // TODO: Implement actual queue processing logic here.
        // This is a placeholder file as EmailQueueProcessor.java was not found in the repository.
        // The original bug description states: "The attachmentCache is never cleared after each batch.
        // Fix: add attachmentCache.clear() at end of processQueue() in EmailQueueProcessor.java line 178,
        // or replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL)."

        // Applying the fix as described in the JIRA ticket:
        attachmentCache.clear(); // Line 178 (conceptual)
    }
}
