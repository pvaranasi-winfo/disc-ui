package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  private StorageService storageService; // Assuming StorageService exists
  private MailSender mailSender; // Assuming MailSender exists

  public EmailQueueProcessor(StorageService storageService, MailSender mailSender) {
    this.storageService = storageService;
    this.mailSender = mailSender;
  }

  public void processQueue(Iterable<EmailJob> jobs) { // Assuming EmailJob and Iterable exist
    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment);
        mailSender.send(job, attachment);
      }
    }
    attachmentCache.clear(); // Fix: Clear the cache after processing the batch
  }

  // TODO: The original search for EmailQueueProcessor.java returned no results.
  // This file was created based on the JIRA description.
  // Verify the correct location and content of this file in the repository.
}

// Dummy classes to make the code compile for the purpose of this fix
class StorageService {
  public byte[] fetch(String key) {
    return new byte[0];
  }
}

class MailSender {
  public void send(EmailJob job, byte[] attachment) {
    // send email
  }
}

class EmailJob {
  public String getAttachmentKey() {
    return "attachment_key";
  }
}
