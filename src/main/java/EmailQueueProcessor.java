// TODO: The EmailQueueProcessor.java file was not found in this repository.
// This file is a placeholder to create a PR for JIRA KAN-21.
// The actual fix for the memory leak in EmailQueueProcessor.java needs to be applied
// in the correct backend service repository once it is identified.
//
// JIRA Description:
// Background-worker service experiences gradual memory leak causing OOMKill every 3.5–4 hours.
// Heap dump analysis shows 78% of memory held by HashMap<String, byte[]> in EmailQueueProcessor.
// The attachmentCache is never cleared after each batch.
// Fix: add attachmentCache.clear() at end of processQueue() in EmailQueueProcessor.java line 178,
// or replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
