// TODO: Implement the date formatting fix as per JIRA SAM1-158
// In ReportFormatter.java line 203, change:
//   DateTimeFormatter.ofPattern('MM/dd/yyyy')
// to:
//   DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
