public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesLasagnaHasBeenInOven) {
        return expectedMinutesInOven() - minutesLasagnaHasBeenInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayersAdded) {
        return numberOfLayersAdded * 2;
    }

    public int totalTimeInMinutes(int numberOfLayersAdded, int minutesLasagnaHasBeenInOven) {
        return preparationTimeInMinutes(numberOfLayersAdded) + minutesLasagnaHasBeenInOven;
    }
}
