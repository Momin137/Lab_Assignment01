package problem04;

public class InterestCalculator {
    public double calculate(int year, int capital, int rate){
        double ans = capital*Math.pow(1+((double)rate/100.00),year);
        return ans;
 }
}