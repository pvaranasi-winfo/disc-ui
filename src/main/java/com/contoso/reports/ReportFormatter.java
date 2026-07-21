/*
TODO: The file ReportFormatter.java was not found in this repository (pvaranasi-winfo/disc-ui).
It is likely located in a backend reporting service. 

The fix suggested in the JIRA ticket SAM1-171 is to change:
  DateTimeFormatter.ofPattern('MM/dd/yyyy')
to:
  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
*/