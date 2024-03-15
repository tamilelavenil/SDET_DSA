package mandatoryHomework.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagram {
	/*
	 * 3. Given an array of strings, group anagrams together. String[] strs =
	 * {"eat", "tea", "tan", "ate", "nat", "bat"}; // Output:
	 * [["bat"],["nat","tan"],["ate","eat","tea"]]
	 */
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		List<List<String>> list = new ArrayList();
		
		Map<String,List<String>> map = new HashMap();
		
		for(String each: strs) {
			char[] strarr = each.toCharArray();
			Arrays.sort(strarr);
			String key = String.valueOf(strarr);
			
			if(!map.containsKey(key)) {
				List<String> list1 = new ArrayList();
				list1.add(each);
				map.put(key, list1);
			}
			
			else {
				map.get(key).add(each);
			}
		}
		for(Entry<String,List<String>> each: map.entrySet()) {
			//each.getValue();
			List<String> list2 = new ArrayList(each.getValue());
			list.add(list2);
		}
		
		System.out.println(list);
	}

}
