import java.util.Scanner;   
import java.lang.Math;          
import java.text.DecimalFormat;     
public class BuiltInPackagesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double result = Math.sqrt(num);
        DecimalFormat df = new DecimalFormat("#.##") ;  
 System.out.println("Square root of " + num + " is: " + df.format(result));
        
        scanner.close();
    }
}
