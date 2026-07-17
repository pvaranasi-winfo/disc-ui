// TODO: EmailQueueProcessor.java not found in this repository.
// This repository (disc-ui) appears to be a UI project, while the bug is described
// as being in a "background worker service".
// The fix for SAM1-160 should be applied to the correct repository containing
// the EmailQueueProcessor.java file.
//
// Original fix description:
// Heap dump analysis shows 78% of memory held by HashMap<String, byte[]> in EmailQueueProcessor.
// The attachmentCache is never cleared after each batch.
// Fix: add attachmentCache.clear() at end of processQueue() in EmailQueueProcessor.java line 178,
// or replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
