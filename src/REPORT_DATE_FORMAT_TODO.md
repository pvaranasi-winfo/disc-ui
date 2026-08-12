## TODO: SAM1-171 - Monthly sales report date format

The JIRA ticket SAM1-171 describes an issue with the monthly sales report displaying dates in MM/DD/YYYY format instead of DD/MM/YYYY. The suggested fix is to change `DateTimeFormatter.ofPattern('MM/dd/yyyy')` to `DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)` in `ReportFormatter.java` line 203.

However, `ReportFormatter.java` and the specified code snippet were not found in this repository (`pvaranasi-winfo/disc-ui`). This repository appears to be a frontend UI repository, and the reporting service is likely a separate backend service.

**Action Required:** The fix needs to be applied in the correct backend repository that contains the `ReportFormatter.java` file and the reporting service logic. Please identify the correct repository and apply the suggested code change there.
