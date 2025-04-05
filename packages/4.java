import java.util.Scanner;          
import java.text.DecimalFormat;    
import java.lang.Math;            

public class BillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Enter total bill amount: ₹");
        double totalBill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        double amountPerPerson = totalBill / people;

               double roundedAmount = Math.ceil(amountPerPerson);

        System.out.println("\nEach person should pay: ₹" + df.format(amountPerPerson));
        System.out.println("Or (rounded): ₹" + (int)roundedAmount);

        scanner.close();
    }
}
