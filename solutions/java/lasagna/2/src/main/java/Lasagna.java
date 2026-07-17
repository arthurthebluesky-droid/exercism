public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minutesLasagnaHasBeenInOven) {
        return expectedMinutesInOven() - minutesLasagnaHasBeenInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayersAdded) {
        return numberOfLayersAdded * PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayersAdded, int minutesLasagnaHasBeenInOven) {
        return preparationTimeInMinutes(numberOfLayersAdded) + minutesLasagnaHasBeenInOven;
    }
}
