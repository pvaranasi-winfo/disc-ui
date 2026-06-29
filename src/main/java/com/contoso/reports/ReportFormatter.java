package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    public String formatSalesDate(Locale userLocale) {
        // TODO: Fix date formatting from MM/dd/yyyy to DD/MM/YYYY based on regional settings.
        // JIRA SAM1-164: The issue was introduced in the reporting service v3.2.0 release (2024-05-28) which centralised date formatting.
        // The locale setting for EU users (locale = 'en-GB') is being ignored and the fallback 'en-US' format is applied.
        // Fix suggestion: In ReportFormatter.java line 203, change:
        // DateTimeFormatter.ofPattern('MM/dd/yyyy')
        // to:
        // DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
        return DateTimeFormatter.ofPattern("MM/dd/yyyy").format(java.time.LocalDate.now()); // Placeholder for original incorrect code
    }
}
