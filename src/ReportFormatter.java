// TODO: This file is a placeholder. The actual ReportFormatter.java needs to be updated in the backend service.
// As per JIRA SAM1-164, the date format needs to be changed from MM/dd/yyyy to DD/MM/YYYY based on regional settings.
// The suggested fix is to change:
//   DateTimeFormatter.ofPattern('MM/dd/yyyy')
// to:
//   DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
