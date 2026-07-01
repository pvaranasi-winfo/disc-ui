## Summary
CRITICAL: Auth service throwing NullPointerException — users cannot log in

## JIRA Ticket
Fixes JIRA: https://phaneendravaranasi.atlassian.net/browse/SAM1-169

## Category
- [x] Code Fix
- [ ] Data Fix

## Root Cause
The authentication service code (AuthController.java and LoginFilter.java) was not found in this repository. It is likely located in a different repository. The NullPointerException indicates that a UserSession object is null when its getToken() method is invoked.

## Changes Made
No changes were made to this repository as the relevant code was not found. The fix would involve adding a null check for the 'session' object before attempting to invoke 'session.getToken()' in AuthController.java and LoginFilter.java in the correct authentication service repository.

## Testing
- [ ] Unit tests pass
- [ ] Manual test performed

## Checklist
- [x] Code is targeted and minimal — no unrelated changes
- [x] Commit message references JIRA key: `SAM1-169`
- [x] PR title follows convention: `fix: <description> [SAM1-169]`

---
*This PR was raised automatically by the Contoso AI Helpdesk Phase 2 agent.*