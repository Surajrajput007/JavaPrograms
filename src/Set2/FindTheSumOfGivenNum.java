package Set2;

import java.util.Scanner;

public class FindTheSumOfGivenNum {

	public static void main(String[] args) {
	

		try {
		        // Create a Scanner object to read input
		        Scanner sc = new Scanner(System.in);
		        
		        // Prompt the user to enter a number
		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();
		        
		        // Close the scanner
		        sc.close();
		        
		        // Calculate the sum of digits
		        int sum = 0;
		        int tempNumber = Math.abs(number); // Work with absolute value to handle negative numbers
		        
		        while (tempNumber > 0) {
		            sum += tempNumber % 10; // Add the last digit to sum
		            tempNumber /= 10;       // Remove the last digit
		        }
		        System.out.println("The sum of the digits is: " + sum);
			    
		}catch(Exception e) {
			
			System.out.println("Enter the Numbers only");
		}
		
		       
	}
}

		
		
		
		
		


	


