package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    public String formatSalesDate(Locale userLocale) {
        // ... other code ...
        // Line 203: Original: DateTimeFormatter.ofPattern('MM/dd/yyyy')
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale);
        // ... rest of the method ...
        return "Formatted Date"; // Placeholder
    }
}
