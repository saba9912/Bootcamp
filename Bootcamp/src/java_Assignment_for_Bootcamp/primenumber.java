package java_Assignment_for_Bootcamp;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		int num = 25;
		boolean isprime = true;
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				isprime = false;
				break;
			}
		}
      if(isprime) {
    	  System.out.println(num + " is a prime number");
      }
      else {
    	  System.out.println("Not a prime number");
      }

	}

}

