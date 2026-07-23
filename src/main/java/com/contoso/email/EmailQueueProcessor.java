package com.contoso.email;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailQueueProcessor {

    private Map<String, byte[]> attachmentCache = new HashMap<>();
    private StorageService storageService;
    private MailSender mailSender;

    public EmailQueueProcessor(StorageService storageService, MailSender mailSender) {
        this.storageService = storageService;
        this.mailSender = mailSender;
    }

    public void processQueue(List<EmailJob> jobs) {
        for (EmailJob job : jobs) {
            byte[] attachment = storageService.fetch(job.getAttachmentKey());
            if (!attachmentCache.containsKey(job.getAttachmentKey())) {
                attachmentCache.put(job.getAttachmentKey(), attachment);
                mailSender.send(job, attachment);
            }
        }
        attachmentCache.clear(); // Fix: Clear the cache after processing a batch
    }

    // Placeholder classes for compilation
    private static class EmailJob {
        String attachmentKey;

        public String getAttachmentKey() {
            return attachmentKey;
        }
    }

    private static class StorageService {
        public byte[] fetch(String key) {
            return new byte[0]; // Dummy implementation
        }
    }

    private static class MailSender {
        public void send(EmailJob job, byte[] attachment) {
            // Dummy implementation
        }
    }
}