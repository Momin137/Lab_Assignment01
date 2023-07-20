package problem04;

public class InterestRateRunner {
    public static void main(String[] args) {
        InterestCalculator interest = new InterestCalculator();
        System.out.println("Balance after 1 year: "+interest.calculate(1,10000,5)+"$");
        System.out.println("Balance after 1 year: "+interest.calculate(2,10000,5)+"$");
        System.out.println("Balance after 1 year: "+interest.calculate(3,10000,5)+"$");
    }
}
