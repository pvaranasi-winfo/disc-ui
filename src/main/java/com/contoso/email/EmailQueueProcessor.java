package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  private StorageService storageService; // Assume this service exists
  private MailSender mailSender; // Assume this service exists

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
    // Fix for SAM1-163: Clear the attachmentCache after processing each batch
    attachmentCache.clear();
  }

  // Placeholder classes for compilation
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

  private static class EmailJob {
    public String getAttachmentKey() {
      return "dummy_key"; // Dummy implementation
    }
  }
}
