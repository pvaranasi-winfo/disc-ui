package src.services;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // Dummy EmailJob and storageService for demonstration
    class EmailJob {
      String attachmentKey;
      public EmailJob(String key) { this.attachmentKey = key; }
      public String getAttachmentKey() { return attachmentKey; }
    }

    class StorageService {
      public byte[] fetch(String key) { return new byte[100]; } // Dummy byte array
    }

    class MailSender {
      public void send(EmailJob job, byte[] attachment) { /* do nothing */ }
    }

    StorageService storageService = new StorageService();
    MailSender mailSender = new MailSender();

    // Simulate some jobs
    EmailJob[] jobs = {
      new EmailJob("key1"),
      new EmailJob("key2"),
      new EmailJob("key1") // Duplicate
    };

    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment);
        mailSender.send(job, attachment);
      }
    }
    // Fix: Clear the cache after processing the batch
    attachmentCache.clear();
  }
}