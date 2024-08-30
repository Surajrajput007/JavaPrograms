package Set2;

import java.util.Scanner;

public class CheckANumberParidroneOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
	int num=	sc.nextInt();
		int rev =0;
		int org_num = num;
		while(num!=0) {
			rev= rev*10+num%10;
			num = num/10;
		}
		if(org_num==rev) {
			System.out.println("the number is paridrome number");
		}
		else {
			System.out.println("its not a paridorme number");
		}
		
		
		
		
		
		
		}

}
