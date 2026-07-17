public class SalaryCalculator {
    private final int DAYS_SKIPPED_THRESHOLD = 5;
    private final double REGULAR_SALARY_MULTIPLIER = 1.0;
    private final double SALARY_MULTIPLIER_PENALTY = 0.85;
    private final int BONUS_QUANTITY_THRESHOLD = 20;
    private final int BASE_BONUS_VALUE = 10;
    private final int INCREASED_BONUS_VALUE = 13;
    private final double BASE_SALARY = 1000.00;
    private final double SALARY_CAP = 2000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < DAYS_SKIPPED_THRESHOLD? REGULAR_SALARY_MULTIPLIER : SALARY_MULTIPLIER_PENALTY;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= BONUS_QUANTITY_THRESHOLD? INCREASED_BONUS_VALUE : BASE_BONUS_VALUE;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double uncappedFinalSalary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return uncappedFinalSalary <= SALARY_CAP ? uncappedFinalSalary : SALARY_CAP;
    } 
}
