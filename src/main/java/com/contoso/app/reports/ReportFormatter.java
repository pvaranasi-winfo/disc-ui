package com.contoso.app.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    public String formatSalesDate(Locale userLocale) {
        // Existing code...
        // line 203
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }
}
