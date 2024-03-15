package mandatoryHomework.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndicesOfAnagram {

	public static void main(String[] args) {
		/*
		 * 1.Given two strings, check if they are anagrams of each other. Given a string
		 * s and a non-empty string p, find all the start indices of p's anagrams in s.
		 * String s = "cbaebabacd"; String p = "abc"; // Output: [0, 6]
		 */	
			String s ="cbaebabacd";
			
			String p= "abc";
			char[] ch = p.toCharArray();
			List<Integer> list = new ArrayList();
			
			char[] parr = new char[26];
			char[] sarr = new char[26];
			for(int i = 0; i<ch.length; i++) {			
				parr[ch[i]-'a']++;
			}
			
			int pointer = 0;
			while(pointer<p.length()) {
				sarr[s.charAt(pointer++)-'a']++;
			}
			
			if(isAnagram(sarr,parr)) {
				list.add(pointer-p.length());
			}
			
			while(pointer<s.length()) {
				sarr[s.charAt(pointer-p.length())-'a']--;
				sarr[s.charAt(pointer++)-'a']++;
				if(isAnagram(sarr,parr)) {
					list.add(pointer-p.length());
				}
			}
		System.out.println(list);
	
		}

	public static boolean isAnagram(char[] sarr, char[] parr) {
		// TODO Auto-generated method stub
		return Arrays.equals(sarr,parr);
	}

}

