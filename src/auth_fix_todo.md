## TODO: Backend Authentication Service Fix

The JIRA ticket SAM1-159 describes a `NullPointerException` in the `AuthController.java` and `LoginFilter.java` of the authentication service. This repository (`disc-ui`) appears to be a frontend application, and the relevant Java code for the authentication service is not present here.

**Action Required:** The fix for SAM1-159 needs to be applied to the backend authentication service repository. Specifically, a null check should be added before invoking `UserSession.getToken()` in `AuthController.java` at line 87, and potentially in `LoginFilter.java` at line 42 if `session` can be null there as well.

This placeholder file is created to facilitate the PR process for the JIRA ticket. The actual code change will be in the backend service.