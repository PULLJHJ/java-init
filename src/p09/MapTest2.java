package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("name", "홍길동");
		m.put("age", "22");
		m.put("address", "양주");
		m.put("trans","남");
		
		Map<String, String> m1 =new HashMap<>();
		m1.put("name","홍길순");
		m1.put("age","21");
		m1.put("address","서울");
		m1.put("trans","여");
		
		Map<String, String> m2 =new HashMap<>();
		m2.put("name","홍길순");
		m2.put("age","21");
		m2.put("address","서울");
		m2.put("trans","여");
		
		Map<String, String> m3 =new HashMap<>();
		m3.put("name","홍길순");
		m3.put("age","21");
		m3.put("address","서울");
		m3.put("trans","여");
		
		Map<String, String> m4 =new HashMap<>();
		m4.put("name","홍길순");
		m4.put("age","21");
		m4.put("address","서울");
		m4.put("trans","여");
		
		List<Map<String,String>> maplist = new ArrayList<>();
		maplist.add(m);
		maplist.add(m1);
		maplist.add(m2);
		maplist.add(m3);
		maplist.add(m4);
		
		for(int i=0; i<maplist.size(); i++) {            //
			Map<String, String> map = maplist.get(i);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key+ " : " + map.get(key) + ",");
			}
			System.out.println();
		}
	}
}

