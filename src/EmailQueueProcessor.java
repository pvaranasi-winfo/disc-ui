// TODO: This file was not found in the 'disc-ui' repository.
// The fix for KAN-20 (memory leak in EmailQueueProcessor) needs to be applied to the correct backend repository.
// The JIRA ticket mentions 'EmailQueueProcessor.java' and 'background worker service', which suggests a backend component.
// This repository 'pvaranasi-winfo/disc-ui' appears to be a frontend UI repository.
//
// Original fix description:
// Add attachmentCache.clear() at end of processQueue() in EmailQueueProcessor.java line 178,
// or replace with Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
