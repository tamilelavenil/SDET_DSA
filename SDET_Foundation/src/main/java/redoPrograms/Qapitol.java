package redoPrograms;

import java.util.HashMap;
import java.util.Map;

public class Qapitol {

	public static void main(String[] args) {
		//reverse string tamil elavenil 
		//"the name is E..." & 12
//		The program not only reverses the string but also provides additional features like counting occurances 
//		of a specific character and checking if the original string is a palindome 
		
		String rev = "tamil elavenill";
		int nameCount =0;
		StringBuilder build= new StringBuilder();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char eachChar: rev.toCharArray()) {
			if(eachChar!=' ') map.put(eachChar, map.getOrDefault(eachChar, 0)+1);
			
		}
		for(int i = rev.length()-1; i>=0; i--){
			build.append(rev.charAt(i));
			if(rev.charAt(i)!=' ') {
				nameCount++;
			}
		}
		if(rev.equals(build.toString())) {
			System.out.println("The string is palindorme");
			}
		
		else System.out.println("The string is not palindorme");
		
		System.out.println(map);
		
		System.out.println(build+" "+nameCount);
		
		


	}

}
