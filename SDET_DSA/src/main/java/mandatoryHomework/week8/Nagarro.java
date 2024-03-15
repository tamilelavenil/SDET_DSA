package mandatoryHomework.week8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Nagarro {
	/*
	 * Print the count for each character in a string with the output sorted by
	 * alphabetical ascending order.
	 * 
	 * Input: nagarro
	 * 
	 * Output:
	 * 
	 * a - 2 g - 1 n-1 o - 1 r - 2
	 */
	public static void main(String[] args) {
		String inp = "nagarro";
		
		char[] arr = inp.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
		
		Map<Character,Integer> map = new HashMap();
		
		for(char i: arr) {
			
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		
		System.out.println(map);

	}

}
