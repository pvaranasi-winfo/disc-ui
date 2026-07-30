## Summary
ORDER PROCESSING DOWN: checkout service returning HTTP 500 — all new orders failing

## JIRA Ticket
Fixes JIRA: https://phaneendravaranasi.atlassian.net/browse/SAM1-179

## Category
- [x] Code Fix
- [ ] Data Fix

## Root Cause
The `OrderService.java` file, which is reported to be the source of the bug, was not found in this repository (`pvaranasi-winfo/disc-ui`). This repository appears to be a frontend application, while the bug description points to a backend service issue related to `OrderService.java` and `inventoryClient.reserve()`.

## Changes Made
No code changes were made in this repository as the relevant file (`OrderService.java`) was not found. This PR is a placeholder to acknowledge the issue and indicate that the fix needs to be applied to the correct backend repository.

TODO: The fix for `JedisConnectionException: Failed to connect to inventory-cache-prod-01:6379 — Connection refused` needs to be applied to the backend service containing `OrderService.java`. The fix should include adding retry with exponential backoff (3 retries, 500ms base) and a circuit breaker to `inventoryClient.reserve()`.

## Testing
- [ ] Unit tests pass
- [ ] Manual test performed

## Checklist
- [x] Code is targeted and minimal — no unrelated changes
- [x] Commit message references JIRA key: `SAM1-179`
- [x] PR title follows convention: `fix: <description> [SAM1-179]`

---
*This PR was raised automatically by the Contoso AI Helpdesk Phase 2 agent.*