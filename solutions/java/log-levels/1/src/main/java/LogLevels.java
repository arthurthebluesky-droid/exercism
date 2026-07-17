public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.split(":")[1];
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.split(":")[0];
        return logLevel.replace("[","").replace("]","").trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
