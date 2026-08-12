
// TODO: Implement EmailQueueProcessor and fix memory leak as per KAN-18.
// The attachmentCache needs to be cleared at the end of processQueue() or replaced with a Caffeine bounded LRU cache.
// Original JIRA description: Heap dump analysis shows 78% of memory held by HashMap<String, byte[]> in EmailQueueProcessor. The attachmentCache is never cleared after each batch. Fix: add attachmentCache.clear() at end of processQueue() in EmailQueueProcessor.java line 178, or replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
