import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); // throws if input is not integer
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type.");
        }
    }
}
