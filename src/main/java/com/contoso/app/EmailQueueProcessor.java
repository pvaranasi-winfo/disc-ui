package com.contoso.app;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Implement actual email processing logic.
    // The original bug description indicated a memory leak here due to attachmentCache not being cleared.
    // For now, adding a clear() call as a placeholder fix.
    // In a real scenario, the storageService and mailSender would be injected and used.

    // Simulate processing some jobs
    for (int i = 0; i < 10; i++) {
      String attachmentKey = "attachment-" + i;
      byte[] attachment = new byte[1024 * 10]; // Simulate 10KB attachment
      if (!attachmentCache.containsKey(attachmentKey)) {
        attachmentCache.put(attachmentKey, attachment);
        System.out.println("Added attachment: " + attachmentKey);
      }
    }

    // Fix: Clear the cache after processing the batch to prevent memory accumulation.
    attachmentCache.clear();
    System.out.println("attachmentCache cleared.");
  }
}