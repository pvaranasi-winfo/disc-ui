package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Replace with actual job fetching logic
    // For now, simulating a single job to demonstrate the fix
    EmailJob job = new EmailJob("attachmentKey123", "recipient@example.com", "Hello", "Body");

    byte[] attachment = storageService.fetch(job.getAttachmentKey());
    if (!attachmentCache.containsKey(job.getAttachmentKey())) {
      attachmentCache.put(job.getAttachmentKey(), attachment);
      mailSender.send(job, attachment);
    }
    attachmentCache.clear(); // Fix: Clear the cache after processing the batch
  }

  // Placeholder classes for compilation
  private static class EmailJob {
    private String attachmentKey;
    private String recipient;
    private String subject;
    private String body;

    public EmailJob(String attachmentKey, String recipient, String subject, String body) {
      this.attachmentKey = attachmentKey;
      this.recipient = recipient;
      this.subject = subject;
      this.body = body;
    }

    public String getAttachmentKey() {
      return attachmentKey;
    }
  }

  private static class StorageService {
    public byte[] fetch(String key) {
      // Simulate fetching attachment bytes
      return new byte[1024]; // 1KB dummy attachment
    }
  }

  private static class MailSender {
    public void send(EmailJob job, byte[] attachment) {
      // Simulate sending email
      System.out.println("Sending email to " + job.recipient + " with attachment of size " + attachment.length + " bytes.");
    }
  }

  private StorageService storageService = new StorageService();
  private MailSender mailSender = new MailSender();
}