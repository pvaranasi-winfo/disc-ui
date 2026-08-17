package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    // This cache is identified as the source of a memory leak.
    // It's never cleared, leading to OOMKills.
    // TODO: Implement attachmentCache.clear() at the end of processQueue()
    // or replace with a Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
    private final Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Simulate processing email queue
        System.out.println("Processing email queue...");

        // Simulate adding attachments to cache
        attachmentCache.put("attachment1.pdf", new byte[1024 * 1024]); // 1MB
        attachmentCache.put("attachment2.jpg", new byte[512 * 1024]);  // 0.5MB

        // TODO: Fix memory leak - attachmentCache needs to be cleared or replaced with a bounded cache.
        // attachmentCache.clear(); // This line should be added to fix the leak.
    }

    public Map<String, byte[]> getAttachmentCache() {
        return attachmentCache;
    }
}
