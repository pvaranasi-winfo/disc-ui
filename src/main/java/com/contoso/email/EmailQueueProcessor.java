// TODO: This file was not found in the repository. This is a placeholder for the fix.
// The actual fix should be applied to the EmailQueueProcessor.java file at line 178.

package com.contoso.email;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private final Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // Existing code for processing email queue...

        // Simulate processing a batch of emails
        System.out.println("Processing email batch...");
        attachmentCache.put("attachment1", new byte[1024 * 1024]); // Simulate adding an attachment
        attachmentCache.put("attachment2", new byte[512 * 1024]);  // Simulate adding another attachment

        // Line 178: Fix for memory leak - clear the attachment cache after each batch
        attachmentCache.clear();
        System.out.println("Attachment cache cleared.");
    }

    // Other methods...
}
