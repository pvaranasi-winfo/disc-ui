// TODO: This file was not found in the repository.
// The suggested fix from JIRA ticket SAM1-173 needs to be applied here:
// In ReportFormatter.java line 203, change:
//   DateTimeFormatter.ofPattern('MM/dd/yyyy')
// to:
//   DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
