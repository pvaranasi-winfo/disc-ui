package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: This is a placeholder file. The actual implementation of processQueue()
    // needs to be added here, and the memory leak fixed by calling attachmentCache.clear()
    // at the end of the method, as described in JIRA SAM1-166.
    // For example:
    // for (EmailJob job : jobs) {
    //   byte[] attachment = storageService.fetch(job.getAttachmentKey());
    //   if (!attachmentCache.containsKey(job.getAttachmentKey())) {
    //     attachmentCache.put(job.getAttachmentKey(), attachment);
    //     mailSender.send(job, attachment);
    //   }
    // }
    // attachmentCache.clear(); // Fix for memory leak
  }
}
