package Set2;

import java.util.Scanner;

public class FindingPerfectinteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a integer");
		int n, i = 1, sum = 0;
		n = sc.nextInt();
		while (i < n) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}

		if (sum == n) {
			System.out.print(i + " is a perfect number");
		} else {
			System.out.print(i + " is not a perfect number");
		}

	}

}
