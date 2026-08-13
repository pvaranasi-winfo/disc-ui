package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    // TODO: This file was not found in the repository.
    // The original bug description indicates a memory leak due to attachmentCache not being cleared.
    // The fix should involve adding attachmentCache.clear() at the end of processQueue()
    // or replacing it with a Caffeine bounded LRU cache.

    private Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Simulate processing emails
        System.out.println("Processing email queue...");

        // Simulate adding attachments to cache
        attachmentCache.put("attachment1", new byte[1024 * 1024]); // 1MB
        attachmentCache.put("attachment2", new byte[512 * 1024]);  // 0.5MB

        // TODO: Add attachmentCache.clear() here to fix the memory leak as per JIRA KAN-18
        // attachmentCache.clear();
    }
}
