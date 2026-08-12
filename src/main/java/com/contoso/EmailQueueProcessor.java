package com.contoso;

import java.util.HashMap;
import java.util.Map;

public class EmailQueueProcessor {

    private Map<String, Object> attachmentCache = new HashMap<>();

    public void processEmailBatch() {
        // Existing processing logic here

        // TODO: KAN-16 - Clear the attachmentCache after each batch to prevent memory leak.
        // This cache is identified as the source of a memory leak in production.
        attachmentCache.clear();
    }

    // Other methods and fields
}
