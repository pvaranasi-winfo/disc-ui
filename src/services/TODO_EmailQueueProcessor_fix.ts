// TODO: EmailQueueProcessor.java not found in this repository.
// This repository appears to be a frontend application.
// The EmailQueueProcessor.java file is likely located in a backend service repository.
// Further investigation is needed to locate the correct repository and apply the fix.
// The JIRA ticket describes a memory leak in EmailQueueProcessor.java,
// where attachmentCache is never cleared.
// The proposed fix is to add attachmentCache.clear() at the end of processQueue()
// or replace it with a Caffeine bounded LRU cache.
