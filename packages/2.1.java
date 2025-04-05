import finance.InterestCalculator;

public class Cal {
    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();
        double si = ic.calculateSimpleInterest(10000, 5, 3);
        System.out.println("Simple Interest: ₹" + si);
    }
}
