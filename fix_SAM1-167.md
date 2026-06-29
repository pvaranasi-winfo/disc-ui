/*
TODO: The file ReportFormatter.java was not found in this repository. 
This PR is a placeholder to acknowledge the issue. 
The fix needs to be applied in the correct repository/service where ReportFormatter.java resides.

Original fix suggestion from JIRA ticket SAM1-167:
In ReportFormatter.java line 203, change:
  DateTimeFormatter.ofPattern('MM/dd/yyyy')
to:
  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
*/