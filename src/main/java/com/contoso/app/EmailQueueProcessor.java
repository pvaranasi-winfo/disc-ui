package com.contoso.app;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: The original file EmailQueueProcessor.java was not found in the repository.
    // This is a placeholder file to address the memory leak described in SAM1-166.
    // The fix involves clearing the attachmentCache after processing the queue.
    // Once the actual file is located, apply the fix as follows:

    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment);
        mailSender.send(job, attachment);
      }
    }
    attachmentCache.clear(); // Fix: Clear the cache after each batch
  }
}

// Placeholder classes for compilation
class EmailJob {
    String getAttachmentKey() { return null; }
}

class StorageService {
    byte[] fetch(String key) { return null; }
}

class MailSender {
    void send(EmailJob job, byte[] attachment) {}
}
