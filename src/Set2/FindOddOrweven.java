package Set2;

import java.util.Scanner;

public class FindOddOrweven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check odd or even ");
		while(true) {
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num + "is a even number");
		}
		else  {
			System.out.println(num+"is a odd number");
		}
		}
	}

}
