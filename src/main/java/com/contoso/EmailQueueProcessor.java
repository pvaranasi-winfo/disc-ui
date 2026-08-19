
package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Existing code for processing email queue
        // ...

        // TODO: Fix for KAN-20 - Memory leak in background worker service
        // The attachmentCache is never cleared after each batch, leading to a memory leak.
        // Add attachmentCache.clear() at the end of processQueue() or replace with a Caffeine bounded LRU cache.
        // For now, adding clear() as per JIRA description.
        attachmentCache.clear();
    }
}
