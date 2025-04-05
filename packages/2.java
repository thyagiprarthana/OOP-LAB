package finance;

public class InterestCalculator {
    public double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}
