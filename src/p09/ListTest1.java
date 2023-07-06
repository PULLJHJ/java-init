package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		for(int i=0; i<7; i++) {
			int rNum = r.nextInt(45) + 1;
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}else {
				i--;
			}
		}
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}

}
