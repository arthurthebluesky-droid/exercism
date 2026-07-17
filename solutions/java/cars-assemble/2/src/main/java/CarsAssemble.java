public class CarsAssemble {
    private final int BASE_PRODUCTION_RATE = 221;

    public double productionRatePerHour(int speed) {
        if(speed <= 4) {
            return BASE_PRODUCTION_RATE * speed;
        }
        if(speed <= 8) {
            return BASE_PRODUCTION_RATE * speed * 0.9;
        }
        if (speed == 9) {
            return BASE_PRODUCTION_RATE * speed * 0.8;
        }
        return BASE_PRODUCTION_RATE * speed * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
