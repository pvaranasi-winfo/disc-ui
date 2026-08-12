package com.contoso.app;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    // ... other methods ...

    public String formatReportDate(Locale userLocale) {
        // TODO: Fix for SAM1-158 - Monthly sales report showing dates as MM/DD/YYYY — should be DD/MM/YYYY for EU users
        // Change: DateTimeFormatter.ofPattern('MM/dd/yyyy')
        // To: DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }

    // ... other methods ...
}
