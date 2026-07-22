class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private static final int SPEED = 10;
    int distanceTravelled = 0;
    int numberOfVictories = 0;

    public void drive() {
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.numberOfVictories, this.numberOfVictories);
    }
}
