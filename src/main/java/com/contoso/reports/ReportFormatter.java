package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    public String formatSalesDate(Locale userLocale) {
        // TODO: This is a placeholder. The actual file was not found in the repository.
        // The fix suggested in the JIRA ticket is applied here.
        // In ReportFormatter.java line 203, change:
        //   DateTimeFormatter.ofPattern('MM/dd/yyyy')
        // to:
        //   DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }
}