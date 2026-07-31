## TODO: Fix for SAM1-160

The JIRA ticket SAM1-160 describes a memory leak in `EmailQueueProcessor.java`. However, the file `EmailQueueProcessor.java` could not be found in the `pvaranasi-winfo/disc-ui` repository. 

Further investigation is needed to locate the correct repository containing `EmailQueueProcessor.java` and apply the fix (add `attachmentCache.clear()` at the end of `processQueue()` or replace with Caffeine bounded LRU cache).
