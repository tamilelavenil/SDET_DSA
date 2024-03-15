package practiceLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		 String pattern = "ab", s = "dog dog";
		 
		 Map<String,String> map = new HashMap();

	        String[] pat = pattern.split("");
	        
	        String[] sent = s.split(" ");
	        
	        System.out.println(Arrays.toString(pat));
	        
	        System.out.println(Arrays.toString(sent));
	        
	        for(int i=0; i<pat.length; i++) {
	        	if(map.containsKey(pat)) {
	        		String check = map.get(pat);
	        		if(!check.equals(sent[i])) System.out.println(false); 
	        	}
	        	else {
	        		map.put(pat[i], sent[i]);
	        	}
	        	
	        }
	        
	        System.out.println(map);
	}

}
