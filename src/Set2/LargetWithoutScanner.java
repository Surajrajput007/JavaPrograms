package Set2;

import java.util.Scanner;

public class LargetWithoutScanner {

	public static void main(String[] args) {

	/*	
		int a = 1001; int b=20; int c = 30;
		
		System.out.println("Finding largest num");
		
		if(a>b && a>c) {
			System.out.println("a is the largest num");
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest num");
		}
		else{
			System.out.println("C is the largest num");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the Largest number");
		
		System.out.println("Enter first num");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the third number");
		int num3= sc.nextInt();
		
		int largest = num1;
		
		if(num2>largest) {
			largest = num2;
		}
		 if(num3>largest) {
			largest = num3;
		}

		 System.out.println("The Largest number is " + largest);
	}

}
