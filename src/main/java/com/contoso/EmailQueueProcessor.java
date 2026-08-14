package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private final Map<String, byte[]> attachmentCache = new HashMap<>();

    public void processQueue() {
        // TODO: Implement email processing logic here.
        // The JIRA ticket KAN-12 indicates a memory leak due to attachmentCache not being cleared.
        // Add attachmentCache.clear() at the end of this method.
        // For example:
        // processEmails();
        // attachmentCache.clear();
    }
}
