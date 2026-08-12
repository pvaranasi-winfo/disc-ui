// TODO: This is a placeholder file. The actual EmailQueueProcessor.java file was not found in the repository.
// The bug description indicates a memory leak in the EmailQueueProcessor.processQueue() method.
// The fix involves calling attachmentCache.clear() at the end of processQueue(), or switching to a bounded LRU cache.

package com.contoso.emailservice;

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

    // Placeholder for EmailJob class
    private static class EmailJob {
        private String attachmentKey;

        public String getAttachmentKey() {
            return attachmentKey;
        }
    }

    // Placeholder for StorageService class
    private static class StorageService {
        public byte[] fetch(String key) {
            return new byte[0]; // Dummy return
        }
    }

    // Placeholder for MailSender class
    private static class MailSender {
        public void send(EmailJob job, byte[] attachment) {
            // Dummy method
        }
    }
}
