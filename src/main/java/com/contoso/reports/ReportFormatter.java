package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    // TODO: This file was created as a placeholder. The actual ReportFormatter.java
    // was not found in the repository.
    // The fix for SAM1-167 should be applied here, changing:
    // DateTimeFormatter.ofPattern('MM/dd/yyyy')
    // to:
    // DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)

    public String formatSalesDate(Locale userLocale) {
        // Placeholder for the original incorrect line
        // DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Placeholder for the suggested fix
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).toString();
    }
}
