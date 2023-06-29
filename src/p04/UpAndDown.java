package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	
	public static int getNum() {
		Random r = new Random();
		return r.nextInt(45) + 1;
		
	}

	public static void main(String[] args) {
		boolean correct = false;
		int rNum = getNum();

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
	}
}