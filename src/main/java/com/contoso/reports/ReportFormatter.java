// TODO: The ReportFormatter.java file was not found in this repository. 
// The fix for SAM1-164 needs to be applied to the correct repository and file.
// Original suggested fix: In ReportFormatter.java line 203, change:
// DateTimeFormatter.ofPattern('MM/dd/yyyy')
// to:
// DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(userLocale)