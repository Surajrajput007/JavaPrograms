package Set2;

import java.util.Scanner;

public class LenghthOfnumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check length");
	int num=sc.nextInt();
StringBuilder sb = new StringBuilder(String.valueOf(num));
	int len = sb.length();
	
	System.out.println("the lenghth of your number is :"+len);
	
	}

}
