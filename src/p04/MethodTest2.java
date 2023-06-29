package p04;

import java.util.Random;

public class MethodTest2 {

	public static int getRandomNum(int max) {
		Random r = new Random();
		int rNum = r.nextInt(max);            // 이게되는 이유는 nextInt()의 데이터 타입이 int형이라서
		rNum += 1;                           // rNum이 int니까 +1은 가능.
		return rNum;						
	}
	public static void main(String[] args) {
		System.out.println(getRandomNum(45)+1);
		System.out.println(getRandomNum(45)+1);
		System.out.println(getRandomNum(45)+1);
		System.out.println(getRandomNum(45)+1);
		System.out.println(getRandomNum(45)+1);
		System.out.println(getRandomNum(45)+1);
		
		
	}

}
