package mandatoryHomework.week6;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * 2.String str1 = "listen"; String str2 = "silent"; // Output: true
		 */
		
		String str1 = "listeno"; String str2 = "silent";
		
		Map<Character, Integer> map = new HashMap();
		
		for(char c: str1.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(char a: str2.toCharArray()) {
			if(map.containsKey(a)&& map.get(a)>1) {
				map.put(a, map.get(a)-1);
			}
			else {
				map.remove(a);
			}
		}
		
		System.out.println(map.isEmpty());
	}

}
