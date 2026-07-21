package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    // ... other code ...

    public String formatSalesDate(Locale userLocale) {
        // TODO: This is a placeholder. The actual file was not found in the repository.
        // The JIRA ticket suggests changing:
        // DateTimeFormatter.ofPattern('MM/dd/yyyy')
        // to:
        // DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }

    // ... other code ...
}
