package p04;

import java.util.Random;

public class MethodTest4 {

	public static int[] getLotto() {     // 메서드란: 기능을 저장하기 위해서 사용.
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int rNum = MethodTest2.getRandomNum(45);
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
		
		return lotto;
		}
	//변수란 다양한 값을 저장하기 위해서 사용하는 수, 고정된 값을 저장하기 위해서였다면 상수를 사용
	public static void printLotto(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
	public static void main(String[] args) {
		int[] lotto = getLotto();
		printLotto(lotto);
		}
	}

