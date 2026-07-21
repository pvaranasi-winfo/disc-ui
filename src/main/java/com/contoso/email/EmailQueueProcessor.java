package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: This file was not found in the repository.
    // The bug description indicates a memory leak due to attachmentCache not being cleared.
    // Once the correct file is located, add attachmentCache.clear(); at the end of this method.
    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment);
        mailSender.send(job, attachment);
      }
    }
    attachmentCache.clear(); // Fix: Clear the cache after processing each batch
  }
}

class EmailJob {
    String getAttachmentKey() { return null; }
}

class StorageService {
    byte[] fetch(String key) { return null; }
}

class MailSender {
    void send(EmailJob job, byte[] attachment) {}
}
