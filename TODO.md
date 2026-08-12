## KAN-6: Auth service throwing NullPointerException

**Problem:** The JIRA ticket KAN-6 describes a NullPointerException in `AuthController.java` and `LoginFilter.java` within an authentication service. 

**Finding:** The current repository `pvaranasi-winfo/disc-ui` appears to be a frontend (JavaScript/TypeScript) application, and the specified Java files were not found during code search. 

**Action:** This PR is created to acknowledge the issue and indicate that the relevant backend authentication service code is likely located in a different repository. Further investigation is needed to identify the correct repository for the authentication service to apply the fix.