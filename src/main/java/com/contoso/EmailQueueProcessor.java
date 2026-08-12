package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  private StorageService storageService;
  private MailSender mailSender;

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
    attachmentCache.clear(); // Fix: Clear the cache after processing the batch
  }

  // Dummy classes for compilation
  static class EmailJob {
    String attachmentKey;
    public String getAttachmentKey() { return attachmentKey; }
  }
  static class StorageService {
    byte[] fetch(String key) { return new byte[0]; }
  }
  static class MailSender {
    void send(EmailJob job, byte[] attachment) {}
  }
}