package redoPrograms;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Qacapital_Coding {
	/*
	 * 
	 **
	 ***
	 ****
	 ******/
	public static void main(String[] args) {
		// input 1,2,3,4,5
		
//		int[] input = {1,2,3,4,5};
//		
//		for(int i=0; i<input.length; i++) {
//			if(input[i]%2>0) {
//				System.out.println(input[i]);
//			}
//		}
		
//		String input = "MADAM";
//		
//		StringBuilder rev = new StringBuilder();
//		
//		for(int i =input.length()-1; i>=0; i--) {
//			
//			rev.append(input.charAt(i));
//		}
//		System.out.println(rev);
//		if (input.equals(rev.toString())) {
//			System.out.println("The string is palindrome");
//		}
//		else {
//			System.out.println("The string is not a palindrome");
//		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
