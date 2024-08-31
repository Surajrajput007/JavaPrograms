package Set2;

public class RemoveJunkorSpecialCharacter {

	public static void main(String[] args) {
String s1= "%&Suraj&#^*()*098 Singh";
String rep=s1.replaceAll("[^a-zA-Z]", "");
	System.out.println(rep);
	}

}
