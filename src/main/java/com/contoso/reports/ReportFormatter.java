package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    // TODO: This file was not found in the repository. This is a placeholder
    // based on the JIRA ticket description. The actual file path and content
    // might be different.

    public String formatSalesDate(Locale userLocale) {
        // Original line (as per JIRA description):
        // DateTimeFormatter.ofPattern('MM/dd/yyyy')

        // Fix suggestion from JIRA ticket:
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }
}
