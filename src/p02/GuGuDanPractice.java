package p02;

import java.util.Scanner;

public class GuGuDanPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~9숫자를 입력하세요: ");
		String Str = scan.nextLine();
		System.out.println("당신이 입력한 숫자는: "+ Str);
		int num = Integer.parseInt(Str);
		
		for (int i=1; i<=9; i++) {
			System.out.println(i + " X "+ Str + " = " + (i*num));
		}
		
	}

}
