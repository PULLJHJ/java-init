package p06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[3];  
		for(int i=0; i<nums.length; i++) {
			int rNum = r.nextInt(9) + 1;
			for(int j=0; j<i; j++) {
				if(nums[j] == rNum) {
					i--;
					break;
				}
			}
			if(nums[i] == 0) {                   // 0인 이유가 초기화 할때 6개의 방이 모두 0으로 초기화되기 때문.
				nums[i] = rNum;
				System.out.println(nums[i]);
			}
		}

		int strike = 0;
		int ball = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1~9까지 숫자를 ,기준으로 입력해주세요");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");

		int[] compNums = new int[numStrs.length]; ////compNums는 입력받은 수 , nums[i]는 랜덤으로 생성 된 수

		int[] compNums = new int[numStrs.length]; //compNums는 입력받은 수 , nums[i]는 랜덤으로 생성 된 수

		for(int i=0; i<numStrs.length; i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
			for(int j=0; j<compNums.length; j++) {
				if(compNums[j] == nums[i] && j==i) {
					strike++;

				}if(compNums[i] == nums[j]) {

				}else if (compNums[i] == nums[j]) {

					ball++;
				}
				}
				}
		System.out.println(strike + "strike" +ball + "ball");
			}

	}

	
