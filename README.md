## TODO: Fix NullPointerException in Auth Service

This is a placeholder to create a PR for JIRA SAM1-165. The relevant Java files (AuthController.java, LoginFilter.java) were not found in this repository. The fix requires adding a null check for the 'session' object before invoking 'session.getToken()' in AuthController.java, line 87, and potentially in LoginFilter.java, line 42.

This repository appears to be a UI, and the authentication service code is likely in a different repository. Further investigation is needed to locate the correct repository for the authentication service.