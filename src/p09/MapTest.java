package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap<>();
		map.put("age", 22);
		map.put("like", 7);
		map.put("rank", 11);
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
	}
}
		
		/*System.out.println(map.get("age"));
		System.out.println(map.get("like"));
		System.out.println(map.get("rank"));
		}
	}
*/
