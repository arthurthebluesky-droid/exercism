
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] LAST_WEEK = {0, 2, 5, 3, 7, 8, 4};
    private static final int BUSY_DAYS_THRESHOLD = 5;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return LAST_WEEK.clone();
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        
        
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            count += birdsPerDay[i];
        }
        
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int birds : birdsPerDay) {
            if (birds >= BUSY_DAYS_THRESHOLD) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
