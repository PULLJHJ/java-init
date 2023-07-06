package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {

		Map<String,String> m = new HashMap<>();
		m.put("name","홍기동");
		m.put("height","180");
		m.put("weight","72");
		m.put("money","1000");
		
		Map<String,String> m1 = new HashMap<>();
		m1.put("name","홍길순");
		m1.put("height","178");
		m1.put("weight","78");
		m1.put("money","10000");
		
		Map<String,String> m2 = new HashMap<>();
		m2.put("name","홍길묵");
		m2.put("height","174");
		m2.put("weight","68");
		m2.put("money","100000");
		
		Map<String,String> m3 = new HashMap<>();
		m3.put("name","김영희");
		m3.put("height","164");
		m3.put("weight","52");
		m3.put("money","1000");
		
		Map<String,String> m4 = new HashMap<>();
		m4.put("name","김철수");
		m4.put("height","184");
		m4.put("weight","72");
		m4.put("money","100022");
	List<Map<String,String>> maplist = new ArrayList<>();
	maplist.add(m);
	maplist.add(m1);
	maplist.add(m2);
	maplist.add(m3);
	maplist.add(m4);
	
	for(int i=0; i<maplist.size(); i++) {    // mpalist의 사이즈 만큼 반복
		Map<String,String> map = maplist.get(i); 
		Iterator<String> it = map.keySet().iterator(); // 
		while(it.hasNext()) {   // 다음 순서에 비교할게 있으면 넘어감.
			String key = it.next();
			System.out.println(key + " : " + map.get(key) + ", ");
		}
		System.out.println();
	}
	
	}

}
