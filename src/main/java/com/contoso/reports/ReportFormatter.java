package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    // ... other methods ...

    public String formatSalesDate(Locale userLocale) {
        // TODO: This file was not found in the repository during the search.
        // This is a placeholder file created based on the JIRA ticket description.
        // The actual location and content of the ReportFormatter.java file
        // needs to be verified.
        // The fix below is applied as per the JIRA ticket suggestion.
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }

    // ... other methods ...
}
