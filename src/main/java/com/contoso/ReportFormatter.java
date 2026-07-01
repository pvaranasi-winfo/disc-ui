package com.contoso;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    public String formatReportDate(Locale userLocale) {
        // TODO: This is a placeholder. The actual fix needs to be applied in the correct repository.
        // The original JIRA ticket mentioned ReportFormatter.java line 203.
        // Change: DateTimeFormatter.ofPattern('MM/dd/yyyy')
        // To: DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale).format(java.time.LocalDate.now());
    }
}
