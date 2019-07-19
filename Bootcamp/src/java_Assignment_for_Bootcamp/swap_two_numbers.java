package java_Assignment_for_Bootcamp;

import java.util.Scanner;

public class swap_two_numbers {

	public static void main(String[] args) {
		int a,b, temp;
		System.out.println("Enter value for a and b");
		Scanner in = new Scanner (System.in);
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Before Swapping a is " + a + " and b is"+ b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping a is " + a +"and b is "+ b);
	

	}

}
