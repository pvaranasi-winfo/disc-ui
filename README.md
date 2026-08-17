## Summary
ORDER PROCESSING DOWN: checkout service returning HTTP 500 — all new orders failing

## JIRA Ticket
Fixes JIRA: https://devarapallisrividya.atlassian.net//browse/KAN-22

## Category
- [x] Code Fix
- [ ] Data Fix

## Root Cause
Redis cluster restarted for cert rotation at 09:40 UTC; application does not handle reconnection gracefully. OrderService.java line 312 has no null check or retry logic on inventoryClient.reserve().

## Changes Made
TODO: The `OrderService.java` file was not found in this repository (`pvaranasi-winfo/disc-ui`). This repository appears to be a UI repository, and the bug description points to a backend service. A fix needs to be applied to the `OrderService.java` file in the correct backend repository to add retry with exponential backoff (3 retries, 500ms base) and a circuit breaker to the `inventoryClient.reserve()` call.

## Testing
- [ ] Unit tests pass
- [ ] Manual test performed

## Checklist
- [x] Code is targeted and minimal — no unrelated changes
- [x] Commit message references JIRA key: `KAN-22`
- [x] PR title follows convention: `fix: <description> [KAN-22]`

---
*This PR was raised automatically by the Contoso AI Helpdesk Phase 2 agent.*