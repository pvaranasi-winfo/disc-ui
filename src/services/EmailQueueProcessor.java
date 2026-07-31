// TODO: Implement EmailQueueProcessor to address memory leak as described in SAM1-160.
// The attachmentCache needs to be cleared after each batch in processQueue()
// or replaced with a Caffeine bounded LRU cache (max 50 entries, 5-minute TTL).
// Refer to JIRA SAM1-160 for details: https://phaneendravaranasi.atlassian.net/browse/SAM1-160
