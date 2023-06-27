package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[3];
		for (int i=0; i<3; i++) {
			arr[i] = r.nextInt(10)+1;
		}
		for (int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
