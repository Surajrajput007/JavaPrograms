package Set2;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Reverse");
		while(true) {
		int num=sc.nextInt();
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("your Reverse number is :"+rev);
}
		*/
		// Approach 2
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to reverse");
	int num=sc.nextInt();
StringBuffer s = new StringBuffer(String.valueOf(num));
StringBuffer rev = s.reverse();
System.out.println(rev);
	sc.close();
	
	}
	
}
