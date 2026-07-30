package com.contoso.service;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Implement actual email processing logic.
    // The original bug description indicated a memory leak here due to attachmentCache not being cleared.
    // For now, adding a clear() call as a placeholder fix.
    // In a real scenario, this would involve fetching email jobs, processing them, and then clearing the cache.
    attachmentCache.clear();
  }
}