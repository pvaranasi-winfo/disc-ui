package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: This file was not found in the repository.
    // The fix for the memory leak should be applied here.
    // The original JIRA description states:
    // "Root cause: EmailQueueProcessor.processQueue() fetches the attachment bytes into memory and adds them to a HashMap for deduplication, but never calls HashMap.clear() after the batch completes."
    // "Fix: Call attachmentCache.clear() at the end of processQueue(), or switch to a bounded LRU cache (e.g., Caffeine with max 50 entries and 5-minute TTL)."

    // Assuming the original code structure based on the JIRA description:
    // for (EmailJob job : jobs) {
    //   byte[] attachment = storageService.fetch(job.getAttachmentKey());
    //   if (!attachmentCache.containsKey(job.getAttachmentKey())) {
    //     attachmentCache.put(job.getAttachmentKey(), attachment);
    //     mailSender.send(job, attachment);
    //   }
    // }
    // attachmentCache.clear(); // This line should be added.
  }
}