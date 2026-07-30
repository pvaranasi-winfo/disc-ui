package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  private StorageService storageService; // Assuming this exists
  private MailSender mailSender; // Assuming this exists

  public EmailQueueProcessor(StorageService storageService, MailSender mailSender) {
    this.storageService = storageService;
    this.mailSender = mailSender;
  }

  public void processQueue(Iterable<EmailJob> jobs) {
    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment);
        mailSender.send(job, attachment);
      }
    }
    attachmentCache.clear(); // Fix: Clear the cache after processing a batch
  }
}

// Assuming these interfaces/classes exist for compilation
interface StorageService {
  byte[] fetch(String key);
}

interface MailSender {
  void send(EmailJob job, byte[] attachment);
}

class EmailJob {
  private String attachmentKey;

  public String getAttachmentKey() {
    return attachmentKey;
  }
}
