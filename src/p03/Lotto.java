package p03;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];     
		for(int i=0; i<lotto.length; i++) {
			int rNum = r.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
					break;
				}
			}
			if(lotto[i] == 0) {                   // 0인 이유가 초기화 할때 6개의 방이 모두 0으로 초기화되기 때문.
				lotto[i] = rNum;
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
