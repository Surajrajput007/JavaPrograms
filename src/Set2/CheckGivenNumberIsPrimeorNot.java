package Set2;

import java.util.Scanner;

public class CheckGivenNumberIsPrimeorNot {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); // this is our scanner class to take input from keyboard
	System.out.println("enter the number to check it's a prime no or not"); // message for user 

int num=	sc.nextInt(); // holding data which entered by user through keyboard
int count = 0; // this will count divisor's

if(num>1) {
	for(int i=1;i<=num;i++) {
		if(num%i ==0) {
			count++;
		}
if(count ==2) {
	System.out.println("this is a prime number"+num);
	}
else {
	System.out.println("this is not a prime number");
}}
	}
	else {
		System.out.println("not prime");
		
	}
}

	
	
}

