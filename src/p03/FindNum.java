package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correct = false; //일단 false로 초기화
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		int Count = 0;
		
		
		while(!correct) {
			System.out.println("1~10 숫자를 입력하세요: ");
			int inputNum = Integer.parseInt(scan.nextLine());	
				correct = rNum == inputNum;
				Count ++;
		}
				System.out.println("정답");
				System.out.println("당신은" + Count + "번째에 맞췄습니다.");
		}
	}
