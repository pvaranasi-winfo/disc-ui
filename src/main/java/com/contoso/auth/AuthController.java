package com.contoso.auth;

import com.contoso.auth.UserSession;

public class AuthController {

    public void validateSession(UserSession session) {
        // TODO: This is a placeholder file. The actual fix involves adding a null check for 'session'
        // before invoking 'session.getToken()'.
        // Example fix:
        if (session == null) {
            throw new IllegalArgumentException("Session cannot be null");
        }
        session.getToken();
    }
}
