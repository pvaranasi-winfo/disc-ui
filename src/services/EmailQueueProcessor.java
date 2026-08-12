package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Simulate fetching email jobs
        // For demonstration, let's assume 'jobs' is a collection of EmailJob objects
        // and 'storageService' is an instance of a storage service.
        // EmailJob and StorageService classes are not provided, so they are commented out.

        // for (EmailJob job : jobs) {
        //     byte[] attachment = storageService.fetch(job.getAttachmentKey());
        //     if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        //         attachmentCache.put(job.getAttachmentKey(), attachment);
        //         mailSender.send(job, attachment);
        //     }
        // }
        attachmentCache.clear(); // Fix: Clear the cache after processing a batch
    }
}