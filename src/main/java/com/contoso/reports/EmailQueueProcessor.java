// TODO: EmailQueueProcessor.java not found in this repository.
// The JIRA ticket KAN-12 describes a memory leak in EmailQueueProcessor.java.
// This file needs to be located and the fix applied.
// The fix involves adding attachmentCache.clear() at the end of processQueue() or replacing attachmentCache with a Caffeine bounded LRU cache.
