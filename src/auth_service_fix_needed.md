## Authentication Service Fix Needed

**JIRA Ticket**: KAN-6

**Problem**: The authentication service is throwing a `NullPointerException` as described in JIRA ticket KAN-6. The stack trace points to `AuthController.java` and `LoginFilter.java`.

**Root Cause**: The code for the authentication service (`AuthController.java`, `LoginFilter.java`) is not present in this `disc-ui` repository. This repository appears to be a client-side application that consumes an external authentication service.

**Proposed Action**: The fix for the `NullPointerException` needs to be applied to the actual authentication service repository. This file serves as a placeholder to acknowledge the issue and the need for an external code change.

**TODO**: 
1. Identify the correct repository for the authentication service.
2. Apply the necessary null checks or session validation logic in `AuthController.java` and `LoginFilter.java` within the authentication service's codebase.
3. Consider adding more robust error handling in this `disc-ui` application to gracefully handle authentication service failures (e.g., displaying a user-friendly message instead of a generic 500 error).
