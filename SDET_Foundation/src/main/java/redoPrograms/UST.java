package redoPrograms;

import java.util.HashMap;
import java.util.Map;

public class UST {

	public static void main(String[] args) {
		//print duplicate chars in the word SUCCESS
		
		String name = "SUCCESS";
		
		Map<Character,Integer> map = new HashMap();
		
		for(char eachChar: name.toCharArray()) {
			
			map.put(eachChar, map.getOrDefault(eachChar,0)+1);
		}
		
		for(Map.Entry<Character,Integer> each: map.entrySet()) {
			
			if(each.getValue()>1) {
				System.out.println("The duplicate chars are:"+each.getKey());
			}
		}
	}

}
