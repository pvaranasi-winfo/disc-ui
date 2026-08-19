// TODO: The file EmailQueueProcessor.java was not found in the repository.
// This is a placeholder file to create a pull request for JIRA KAN-21.
// The original bug description states:
// "Heap dump analysis shows 78% of memory held by HashMap<String, byte[]> in EmailQueueProcessor.
// The attachmentCache is never cleared after each batch.
// Fix: add attachmentCache.clear() at end of processQueue() in EmailQueueProcessor.java line 178,
// or replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL)."
//
// Please locate the correct EmailQueueProcessor.java file and apply the fix.
