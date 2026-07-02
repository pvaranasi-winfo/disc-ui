package services;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {
  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Replace with actual job fetching logic
    // for (EmailJob job : jobs) {
    //   byte[] attachment = storageService.fetch(job.getAttachmentKey());
    //   if (!attachmentCache.containsKey(job.getAttachmentKey())) {
    //     attachmentCache.put(job.getAttachmentKey(), attachment); // memory accumulates
    //     mailSender.send(job, attachment);
    //   }
    // }
    // Fix: Clear the attachmentCache after processing each batch to prevent memory leak
    attachmentCache.clear();
  }
}