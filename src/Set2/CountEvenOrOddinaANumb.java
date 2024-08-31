package Set2;

import java.util.Scanner;

public class CountEvenOrOddinaANumb {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
	int num=	sc.nextInt();
		int even =0;
		int odd =0;
		
		while(num>0) {
			int rem=num%10;
		
		
		if(rem %2==0) {
			even++;
		}
		else {
			odd++;
		}
		num=num/10;
		}
		System.out.println("total no of even no is :"+even);
		System.out.println("total no of odd no is :"+ odd);
	}
}
