## TODO: Fix NullPointerException in Auth Service

The JIRA ticket SAM1-180 describes a NullPointerException in the authentication service (AuthController.java and LoginFilter.java). This repository (disc-ui) appears to be a frontend application and does not contain the Java backend code for the authentication service.

**Action Required:** The fix needs to be applied to the backend authentication service repository. The root cause is likely a missing null check for the `session` object before calling `session.getToken()` in `AuthController.java` at line 87.

**Suggested Fix (for the backend service):**
```java
// In AuthController.java, around line 87
if (session != null) {
    return session.getToken();
} else {
    // Handle null session, e.g., throw an exception or return an error response
    throw new UnauthorizedException("User session is null");
}
```

This PR is created to acknowledge the issue and indicate that the fix is required in a different repository.