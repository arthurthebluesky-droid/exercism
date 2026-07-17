public class JedliksToyCar {
    private int metersDriven;
    private int percentBatteryRemaining = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        if(percentBatteryRemaining < 1) {
            return "Battery empty";
        }
        
        return "Battery at " + percentBatteryRemaining + "%";
    }

    public void drive() {
        if(percentBatteryRemaining < 1) {
            return;
        }
        
       metersDriven += 20;
       percentBatteryRemaining -= 1;
    }
}
