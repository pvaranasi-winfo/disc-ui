package com.contoso.email;

import com.contoso.storage.StorageService;
import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();
  private StorageService storageService; // Assuming StorageService is injected or instantiated

  public EmailQueueProcessor(StorageService storageService) {
    this.storageService = storageService;
  }

  public void processQueue(Iterable<EmailJob> jobs) {
    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment); // memory accumulates
        // mailSender.send(job, attachment); // Assuming mailSender is available
      }
    }
    attachmentCache.clear(); // Fix: Clear the cache after processing the batch
  }

  // Placeholder for EmailJob and StorageService for compilation
  private static class EmailJob {
    String attachmentKey;

    public String getAttachmentKey() {
      return attachmentKey;
    }
  }

  private static class StorageService {
    public byte[] fetch(String key) {
      return new byte[0]; // Dummy implementation
    }
  }
}