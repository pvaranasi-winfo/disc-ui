package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // TODO: Implement actual email processing logic.
        // The original JIRA ticket SAM1-170 describes a memory leak here.
        // Root cause: attachmentCache was never cleared after batch processing.
        // Fix: Call attachmentCache.clear() at the end of processQueue(),
        // or switch to a bounded LRU cache (e.g., Caffeine with max 50 entries and 5-minute TTL).
        // For now, adding a placeholder to address the JIRA ticket.
        attachmentCache.clear(); // Placeholder fix based on JIRA description
    }
}
