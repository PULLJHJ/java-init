package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~9사이의 숫자 입력: ");
		String numStr = scan.nextLine();
		System.out.println("입력한 숫자:" + numStr);
		int num = Integer.parseInt(numStr);
		
		for(int i=1; i<=9; i++) {
			System.out.println(i + " X " + numStr + " = " + (i * num));
		}
	}
}
