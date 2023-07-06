package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("name","ezreal");
		m.put("type","longdistance");
		m.put("spell", "f");
		m.put("level", "30");
		
		Map<String,String> m1 = new HashMap<>();
		m1.put("name", "vayne");
		m1.put("type", "longdistance");
		m1.put("spell", "f");
		m1.put("level", "30");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("name", "garen");
		m2.put("type", "shortdistance");
		m2.put("spell", "v");
		m2.put("level", "27");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("name", "zac");
		m3.put("type","shortdistance");
		m3.put("spell", "i");
		m3.put("level", "24");
		
		Map<String,String> m4 = new HashMap<>();
		m4.put("name", "leesin");
		m4.put("type", "shortdistance");
		m4.put("spell" ,"f");
		m4.put("level", "21");
		
		List<Map<String,String>> maplist = new ArrayList<>();
		maplist.add(m);
		maplist.add(m1);
		maplist.add(m2);
		maplist.add(m3);
		maplist.add(m4);
		
		for(int i=0; i<maplist.size(); i++) {
			Map<String, String> map = maplist.get(i);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key+ " : "+ map.get(key)+ ",");
			}
			System.out.println();
		}
		
	}

}
