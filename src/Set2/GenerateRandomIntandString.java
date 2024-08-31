package Set2;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomIntandString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number ");
	while(true) {
	int ra=sc.nextInt();
		Random R = new Random();
	int	rand=R.nextInt(ra);
	System.out.println(rand);
	}

		
	}
}
