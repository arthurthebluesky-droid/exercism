class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distanceDriven = 0;
    int batteryCharge = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryCharge - batteryDrain < 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()) {
            distanceDriven += speed;
            batteryCharge -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxTimesDriven = 100 / car.batteryDrain;
        return distance <= maxTimesDriven * car.speed;
    }
}
