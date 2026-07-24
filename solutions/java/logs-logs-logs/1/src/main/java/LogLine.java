public class LogLine {
    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return LogLevel.fromCode(logLine.substring(1, 4));
    }

    public String getOutputForShortLog() {
        return LogLevel.getOutputForShortLog(logLine);
    }
}
