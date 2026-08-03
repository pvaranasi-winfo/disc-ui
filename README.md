## Summary
CRITICAL: Auth service throwing NullPointerException — users cannot log in

## JIRA Ticket
Fixes JIRA: https://phaneendravaranasi.atlassian.net/browse/SAM1-165

## Category
- [x] Code Fix
- [ ] Data Fix

## Root Cause
(to be determined from code analysis)

## Changes Made
TODO: The relevant files (AuthController.java, LoginFilter.java) were not found in this repository. This PR is a placeholder to indicate that the fix needs to be applied in the correct authentication service repository. The fix should involve adding a null check for the 'session' object before attempting to invoke 'UserSession.getToken()'.

## Testing
- [ ] Unit tests pass
- [ ] Manual test performed

## Checklist
- [x] Code is targeted and minimal — no unrelated changes
- [x] Commit message references JIRA key: `SAM1-165`
- [x] PR title follows convention: `fix: <description> [SAM1-165]`

---
*This PR was raised automatically by the Contoso AI Helpdesk Phase 2 agent.*