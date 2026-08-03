// TODO: Implement EmailQueueProcessor.java to fix memory leak.
// The attachmentCache in EmailQueueProcessor is never cleared after each batch.
// Add attachmentCache.clear() at the end of processQueue() or replace with Caffeine bounded LRU cache.
