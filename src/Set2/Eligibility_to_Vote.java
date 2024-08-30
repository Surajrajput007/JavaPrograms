package Set2;

import java.util.Scanner;

public class Eligibility_to_Vote {

	public static void main(String[] args) {
while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check eligibility to Vote Enter Your Age");
		
		int age=sc.nextInt();
		
		if(age >=18) {
		 System.out.println("Eligible for vote");
		}
		else {
			System.out.println("You are not eligible");
		}
}	
	}
	
	}


