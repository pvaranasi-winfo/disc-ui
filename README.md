## Memory Leak Fix

This PR is a placeholder as the `EmailQueueProcessor.java` file was not found in this repository. The JIRA ticket describes a memory leak in a Java background worker service, but this repository appears to be a frontend (React/TypeScript) project.

**TODO:** The `EmailQueueProcessor.java` file needs to be located in the correct backend repository and the fix applied there. The fix involves adding `attachmentCache.clear()` at the end of `processQueue()` or replacing `attachmentCache` with a Caffeine bounded LRU cache.