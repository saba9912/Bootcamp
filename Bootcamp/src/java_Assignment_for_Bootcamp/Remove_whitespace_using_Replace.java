package java_Assignment_for_Bootcamp;

public class Remove_whitespace_using_Replace {

	public static void main(String[] args) {
		
		String s="Removing White Space Using Replace";
		String s1=s.replaceAll("\\s+", "");
		System.out.println(s1);
	

	}

}
