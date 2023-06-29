package p03;

import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		Random r = new Random();
		int lotto[] = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int rNum = r.nextInt(40) + 1;
			lotto[i] = rNum;
			for(int j=0; j<i; j++) {
				if(rNum == 0) {
					i--;
					break;
				}
			}
			if(lotto[i] == 0) {
				lotto[i] = rNum;
			}
			System.out.println(lotto[i]);
		}
	}

}
