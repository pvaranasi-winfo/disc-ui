// TODO: This file was not found in the repository.
// The JIRA ticket KAN-20 describes a memory leak in EmailQueueProcessor.java.
// The fix involves adding attachmentCache.clear() at the end of processQueue()
// or replacing attachmentCache with a Caffeine bounded LRU cache.
// Please locate the correct EmailQueueProcessor.java file and apply the fix.
