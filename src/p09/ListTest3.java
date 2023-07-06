package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
		while(numList.size()<50) {
			int rNum = r.nextInt(200) + 1;
			
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		for(int i=0; i<numList.size(); i++) {
			int num = numList.get(i);
			int odd = num %2;
			if(odd == 1) {
				System.out.println(num + "홀");
			}
		}
	}

}
