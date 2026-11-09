public class stepTracker{
    private int ministeps = 0;
    private int activeDays = 0;
    private int totalDays = 0;
    private int totalSteps = 0;
    public StepTracker(int minimumsteps){
        ministeps = minimumsteps;
        activeDays = 0;
        totalDays = 0;
        totalSteps = 0;
    } 

    public void addDailySteps(int steps){
        totalSteps += steps;
        totalDays ++;
        if (steps >= ministeps){
            activeDays ++;
        }

    }

    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        if (totalDays == 0.0){
            return 0.0;
        }
        return (double)totalSteps/totalDays;
    }
}