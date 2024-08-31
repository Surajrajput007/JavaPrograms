package Set2;

public class CountCharacterOfOccurenceInAString {

	public static void main(String[] args) {

		String s="Java is a naughy language";
		// find how many a are here
	int	count1=s.length();
	String s2=	s.replaceAll("[a]", "");
		int count2=s2.length();
		int total_A=count1-count2;
		System.out.println(total_A);
	}

}
