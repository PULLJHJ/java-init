package p03;


import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {                /* 로또 번호 랜덤 생성*/
		Random r = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			System.out.println(lotto[i]);
		}
		Scanner sc = new Scanner(System.in);                  /* 번호 입력 */
		System.out.println("1~45까지의 숫자입력해주세요:");
		String num = sc.nextLine();	 
		String[] strs = num.split(",");
		int cnt =0;              
		for(int i=0; i<strs.length; i++) {
			int strNum = Integer.parseInt(strs[i]);
			for(int j=0; j<lotto.length; j++) {
				if(lotto[j] == strNum) {
					cnt++;
				}
				
					
				}
			}
			System.out.println(cnt + "개 맞추셨습니다.");
		}
		
	}	

