public enum LogLevel {
    TRACE("TRC",1),
    DEBUG("DBG",2),
    INFO("INF",4),
    WARNING("WRN",5),
    ERROR("ERR",6),
    FATAL("FTL",42),
    UNKNOWN("UKN",0);

    private final String stringLevel;
    private final int intLevel;

    LogLevel(String stringLevel, int intLevel) {
        this.stringLevel = stringLevel;
        this.intLevel = intLevel;
    }

    public static LogLevel fromCode(String code) {
        for (LogLevel level : values()) {
            if (level.stringLevel.equals(code)) {
                return level;
            }
        }
        return LogLevel.UNKNOWN;
    }

    public static String getOutputForShortLog(String stringLevel) {
        int prefix = fromCode(stringLevel.substring(1, 4)).intLevel;
        String sufix = stringLevel.substring(stringLevel.indexOf(':') + 1).trim();
        
        return prefix + ":" + sufix; 
    }
}