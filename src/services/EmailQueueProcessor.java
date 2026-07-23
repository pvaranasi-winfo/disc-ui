// TODO: This file is a placeholder. The original EmailQueueProcessor.java was not found in the repository.
// The bug description indicates a memory leak in EmailQueueProcessor.java line 156-178.
// The fix involves calling attachmentCache.clear() at the end of processQueue(), or switching to a bounded LRU cache.

package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Simulate fetching email jobs
        // for (EmailJob job : jobs) {
        //     byte[] attachment = storageService.fetch(job.getAttachmentKey());
        //     if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        //         attachmentCache.put(job.getAttachmentKey(), attachment);
        //         mailSender.send(job, attachment);
        //     }
        // }
        // Fix: Clear the cache after processing each batch to prevent memory accumulation
        attachmentCache.clear();
    }
}
