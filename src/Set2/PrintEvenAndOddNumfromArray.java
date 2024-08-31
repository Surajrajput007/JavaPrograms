package Set2;

public class PrintEvenAndOddNumfromArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8};
	
	for(int x:a) {
		if(x%2==0) {
			System.out.println("even nu"+x);
		}
		else {
			System.out.println("odd"+x);
		}
	}
	
	
}
}
