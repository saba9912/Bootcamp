package java_Assignment_for_Bootcamp;

public class palindrome {

	public static void main(String[] args) {
		String word = "Goodmorning";
		char myarray[]=word.toCharArray();
		String reversword = "";
		
		for (int i =word.length()-1; i>=0; i--) {
			reversword = reversword + myarray[i];
			
		}
		System.out.println(reversword);
		if(word.equalsIgnoreCase(reversword)) {
			System.out.println("Palindrom");
			
			
		}else {
			System.out.println("Not Palindrom");
		}

	}

}
