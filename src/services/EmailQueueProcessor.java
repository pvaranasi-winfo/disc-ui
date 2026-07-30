package services;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Implement actual email job processing logic here.
    // The original bug description indicated a memory leak due to attachmentCache not being cleared.
    // For now, we'll add the clear() call as a placeholder fix.
    // In a real scenario, the 'jobs' and 'storageService' would be injected or retrieved.

    // Example of how the original code might have looked (based on bug description):
    /*
    for (EmailJob job : jobs) {
      byte[] attachment = storageService.fetch(job.getAttachmentKey());
      if (!attachmentCache.containsKey(job.getAttachmentKey())) {
        attachmentCache.put(job.getAttachmentKey(), attachment); // memory accumulates
        mailSender.send(job, attachment);
      }
    }
    */

    // Fix: Clear the cache after processing a batch of emails to prevent memory accumulation.
    attachmentCache.clear();
  }
}
