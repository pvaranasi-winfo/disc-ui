package com.contoso.auth;

// TODO: This is a placeholder file. The actual AuthController needs to be fixed in the correct repository.
// The NullPointerException occurs because 'session' is null in validateSession.
// A null check should be added before invoking session.getToken().
public class AuthController {
    public UserSession validateSession(UserSession session) {
        // Original problematic line:
        // String token = session.getToken();

        // Proposed fix: Add null check
        if (session == null) {
            // Handle null session, e.g., throw an exception or return null
            return null;
        }
        String token = session.getToken();
        return session;
    }
}

class UserSession {
    public String getToken() {
        return "dummy_token";
    }
}
