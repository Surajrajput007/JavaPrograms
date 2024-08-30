package Set2;

import java.util.Scanner;

public class SwitchWeekDays {

	public static void main(String[] args) {

		System.out.println("Choose 1- 7 to see Day");
		
		Scanner sc = new Scanner(System.in);
		//while(true) {
	int no=	sc.nextInt();
		
	
		switch(no) { 
		
		case 1 : System.out.println("Sunday"); break;
		case 2 : System.out.println("Monday");break;
		case 3 :System.out.println("Tuesday"); break;
		case 4:System.out.println("Wednesday"); break;
		case 5 : System.out.println("Thrusday"); break;
		case 6 : System.out.println("Friday"); break;
		case 7 : System.out.println("Saturday"); break;
		default : System.out.println("Invalid input please Choose b/w '1-7'");
		
		
		}
	sc.close();
		
	  }

	}
 
