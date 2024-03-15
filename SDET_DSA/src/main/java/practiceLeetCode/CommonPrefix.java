package practiceLeetCode;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] name1 = {"flower","flow","flight","fl"};
		String[] name = {"dog","racecar","car"};
		
		Arrays.sort(name);
		Arrays.sort(name1);
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name1));
		
		StringBuilder out =new StringBuilder();
		
		String b= name[name.length-1];
		String a = name[0];
		int index=0;
		while(index<a.length()&&index<b.length()) {
			if(a.charAt(index)==b.charAt(index))out.append(a.charAt(index++));
			else break;
			
		}
		System.out.println(out);
		
	}

}
