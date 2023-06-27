package p02;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1; // 0~0.99999999 에서 45를 곱하고 1을 더하면 1~45.99999값이 됨
			System.out.println(lotto[i]);
		}
	}
}
