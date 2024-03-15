package mandatoryHomework.week6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TamilElavenil {
	static int value = summa.a;
	public static void main(String[] args) {
		String[] name = {"Tamil","Elavenil","Tamil","Elavenil","Tamil","Elavenil"};
		
		Map<String,Integer> map = new HashMap();
		
		List<String> list = new ArrayList();
		
		for(String each: name) {
			if(!map.containsKey(each)) {
				map.put(each, 1);
				list.add(each);
			}
			else {
				list.add(each+""+map.get(each));
				map.put(each, map.get(each)+1);
				
				
			}
		}
		
		System.out.println(value);

	}

}
