// TODO: The files AuthController.java and LoginFilter.java were not found in this repository.
// This is a placeholder file to create a PR for JIRA KAN-6.
// The NullPointerException in AuthController.java at line 87 and LoginFilter.java at line 42 needs to be addressed.
// It is likely that the 'session' object is null when UserSession.getToken() is invoked.
// A null check should be added before attempting to access 'session.getToken()'.
// Example:
// if (session != null) {
//     session.getToken();
// } else {
//     // Handle null session case, e.g., throw an exception or return an error
// }
