package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownPractice {
	public static String UP() {
		Random r = new Random();
		boolean correct = false;
		int rNum = r.nextInt(10) + 1;
		
		Scanner scan = new Scanner(System.in);
		
		while(!correct) {
			System.out.println("1~10: ");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr); 
		if(correct = rNum == num) {
			System.out.println("맞춤");
		}if(rNum > num) {
			System.out.println("UP");
		}if(rNum < num) {
			System.out.println("Down");

		}
	}
		return "";
	}



	public static void main(String[] args) {
		System.out.println(UP());
}
}

