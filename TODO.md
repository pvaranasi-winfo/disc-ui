## TODO for SAM1-165

The authentication service is throwing a NullPointerException in `AuthController.java` and `LoginFilter.java`. This repository (`disc-ui`) does not contain the relevant Java code for the authentication service. The fix needs to be applied to the separate authentication service repository.

**Action required:**
1. Locate the authentication service repository.
2. In `AuthController.java`, line 87, add a null check for `session` before invoking `session.getToken()`.
3. In `LoginFilter.java`, line 42, ensure that the `session` object is not null before being used.

This PR is a placeholder to track the issue in the UI repository, acknowledging that the fix is external.