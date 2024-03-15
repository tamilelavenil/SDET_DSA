package lti_interview;

import java.util.HashSet;
import java.util.Set;

public class LTI_FirstRound {
	//find duplicates in a string
	//input string  = "elavenil" 
	//output print duplicates
	public static void main(String[] args) {
		String name = "elavenil";
		Set<Character> set = new HashSet();
		
		for(char i: name.toCharArray()) {
			if(!set.contains(i)) {
				set.add(i);
			}
//			else {
//				System.out.println("The duplicates are: "+ i);
//			}
		}
		System.out.println(set);

	}

}
