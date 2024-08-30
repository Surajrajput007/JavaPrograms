package Set2;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Initialize the largest number to the first number
        int largest = num1;
        
        // Compare the second number with the current largest number
        if (num2 > largest) {
            largest = num2;
        }
        
        // Compare the third number with the current largest number
        if (num3 > largest) {
            largest = num3;
        }
        
        // Output the largest number
        System.out.println("The largest number is: " + largest);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
