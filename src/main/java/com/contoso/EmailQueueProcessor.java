// TODO: The original EmailQueueProcessor.java file was not found in the repository.
// This file needs to be added or located.
// Based on the JIRA ticket KAN-21, the fix involves adding attachmentCache.clear() at the end of processQueue()
// or replacing attachmentCache with a Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
//
// Example of the proposed fix (assuming the file structure and method exist):
//
// public class EmailQueueProcessor {
//     private HashMap<String, byte[]> attachmentCache = new HashMap<>(); // Assuming this is the problematic cache
//
//     public void processQueue() {
//         // ... existing code to process email queue ...
//
//         // After processing a batch, clear the cache to prevent memory leaks
//         attachmentCache.clear();
//     }
// }
