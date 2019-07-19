package java_Assignment_for_Bootcamp;

public class reverse_string {

	public static void main(String[] args) {
		String word = "sabana";
		char myarray[]=word.toCharArray();
		String reversword = "";
		
		for (int i =word.length()-1; i>=0; i--) {
			reversword = reversword + myarray[i];
			
		}
		System.out.println(reversword);

		// Using StringBufferClass
//		   StringBuffer sf = new StringBuffer(word);
//		   System.out.println(sf.reverse());
		   
	}

}
