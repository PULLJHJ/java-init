package p09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest5 {
	public static void main(String[] args) {
		List<Integer>numList = new ArrayList<>();
		numList.add(10); // 0
		numList.add(1); // 1
 		numList.add(35); // 2
		numList.add(17); // 3
		numList.add(4);  // 4 
		Collections.sort(numList);
		System.out.println(numList);
		
		
		for(int i=0; i<numList.size(); i++) {
			for(int j=i+1; j<numList.size(); j++) {
				if(numList.get(i)>numList.get(j)) {
					int tmp = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, tmp);
				}
			}
		}
		System.out.println(numList);

	}
}

		
	