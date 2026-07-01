package com.contoso.reports;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ReportFormatter {

    public String formatSalesDate(Locale userLocale) {
        // TODO: Implement the date formatting logic as per JIRA SAM1-158
        // Original line (as per JIRA description):
        // DateTimeFormatter.ofPattern('MM/dd/yyyy')
        // Should be changed to:
        // DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)
        return "TODO: Implement date formatting";
    }
}
