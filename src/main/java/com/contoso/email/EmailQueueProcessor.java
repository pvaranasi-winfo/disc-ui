package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Replace EmailJob, storageService, and mailSender with actual implementations
    // For now, this is a placeholder to demonstrate the fix.
    // Example: List<EmailJob> jobs = storageService.fetchEmailJobs();
    // for (EmailJob job : jobs) {
    //   byte[] attachment = storageService.fetch(job.getAttachmentKey());
    //   if (!attachmentCache.containsKey(job.getAttachmentKey())) {
    //     attachmentCache.put(job.getAttachmentKey(), attachment);
    //     mailSender.send(job, attachment);
    //   }
    // }
    attachmentCache.clear(); // Fix: Clear the cache after processing each batch
  }
}