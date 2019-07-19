package java_Assignment_for_Bootcamp;

import java.util.Arrays;

public class Second_highest_number_Array {

	public static void main(String[] args) {
//		we can do Sorting [1st Method]
//		int num[]= {1,9,5,2,8,-1,3,55};
//		int n = num.length;
//		
//		Arrays.sort(num);
//		System.out.println("Second highest number " + num[n-2]);
		
//		2nd Method
		int num[]= {1,9,5,2,8,-1,3,55,55};
		int n = num.length;
		
		int highest= Integer.MIN_VALUE;
		int secondHighest= Integer.MIN_VALUE;
		
//		Traversing an array
		for(int i=0; i<n; i++) {
			
			if(num[i]>highest) {
				secondHighest= highest;
				highest= num[i];
			}
			if(num[i]<highest && num[i]> secondHighest) {
				secondHighest = num[i];
			}
			
		}
		System.out.println("second highest number " + secondHighest);

	}

}
