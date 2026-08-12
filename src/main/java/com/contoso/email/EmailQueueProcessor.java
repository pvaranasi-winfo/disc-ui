package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Implement actual email processing logic here.
    // The original problem description states that attachment bytes are fetched
    // and stored in attachmentCache without being cleared, leading to a memory leak.
    //
    // For now, this is a placeholder file.
    //
    // Original problematic code snippet from JIRA description:
    // for (EmailJob job : jobs) {
    //   byte[] attachment = storageService.fetch(job.getAttachmentKey());
    //   if (!attachmentCache.containsKey(job.getAttachmentKey())) {
    //     attachmentCache.put(job.getAttachmentKey(), attachment); // memory accumulates
    //     mailSender.send(job, attachment);
    //   }
    // }
    //
    // Fix: Add attachmentCache.clear() at the end of the method.
    // attachmentCache.clear();
  }
}
