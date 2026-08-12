package com.contoso.app.service;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // Assuming EmailJob and storageService are defined elsewhere
    // For demonstration, let's mock them
    class EmailJob {
      String attachmentKey;
      public String getAttachmentKey() { return attachmentKey; }
    }
    class StorageService {
      byte[] fetch(String key) { return new byte[0]; } // Mock
    }
    class MailSender {
      void send(EmailJob job, byte[] attachment) { /* Mock */ }
    }

    StorageService storageService = new StorageService();
    MailSender mailSender = new MailSender();

    // Mock jobs for demonstration
    EmailJob job1 = new EmailJob();
    job1.attachmentKey = "key1";
    EmailJob job2 = new EmailJob();
    job2.attachmentKey = "key2";
    EmailJob[] jobs = {job1, job2};


    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment); // memory accumulates
        mailSender.send(job, attachment);
      }
    }
    attachmentCache.clear(); // Fix: Clear the cache after processing the batch
  }
}