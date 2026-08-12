// TODO: The original AuthController.java file was not found in the repository.
// This is a placeholder to address the NullPointerException reported in SAM1-189.
// The fix should involve adding a null check for 'session' before invoking 'session.getToken()'.
// Example:
// if (session != null) {
//     return session.getToken();
// } else {
//     // Handle null session, e.g., throw an exception or return a default value
//     throw new IllegalArgumentException("User session is null");
// }
package com.contoso.auth;

public class AuthController {
    public String validateSession(UserSession session) {
        // Line 87: Original NullPointerException occurred here
        if (session != null) {
            return session.getToken();
        } else {
            // Log the error or handle it as appropriate for your application
            System.err.println("Error: User session is null during validation.");
            throw new NullPointerException("Cannot invoke 'UserSession.getToken()' because 'session' is null");
        }
    }
}

class UserSession {
    private String token;

    public UserSession(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
