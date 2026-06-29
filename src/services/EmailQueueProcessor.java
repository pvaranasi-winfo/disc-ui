package com.contoso.emailservice;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  private StorageService storageService; // Assume this is injected or initialized
  private MailSender mailSender; // Assume this is injected or initialized

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
    // Fix: Clear the attachmentCache after processing the batch to prevent memory leak
    attachmentCache.clear();
  }

  // Dummy interfaces/classes for compilation purposes
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
    // Other fields and methods
  }
}
// TODO: This file was created as a placeholder because the original file could not be located in the repository.
// Please verify the correct location of EmailQueueProcessor.java and apply the fix there.
// The fix involves adding attachmentCache.clear() at the end of the processQueue() method.
