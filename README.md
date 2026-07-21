# disc-ui

This is a placeholder for the fix for SAM1-164.

**TODO**: The JIRA ticket mentions `ReportFormatter.java` line 203. This file was not found in the `pvaranasi-winfo/disc-ui` repository. It is likely located in a backend reporting service repository.

The suggested fix is to change:
`DateTimeFormatter.ofPattern('MM/dd/yyyy')`
to:
`DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)`

This change needs to be applied in the correct repository where `ReportFormatter.java` resides.
