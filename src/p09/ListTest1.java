package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
		while(numList.size()<7) {
			int rNum = r.nextInt(100) +1;
			
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
			
		}
		System.out.println(numList);
	}

}
