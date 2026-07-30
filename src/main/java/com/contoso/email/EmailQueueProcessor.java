package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

  private Map<String, byte[]> attachmentCache = new HashMap<>();

  public void processQueue() {
    // TODO: Implement actual email processing logic.
    // The original bug description indicated a memory leak here
    // because attachmentCache was never cleared.
    // A fix would involve calling attachmentCache.clear() at the end of this method,
    // or using a bounded LRU cache.
    // For example:
    // attachmentCache.clear();
  }
}
