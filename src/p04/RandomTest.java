package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	
	public static String getRock() {
		Random r = new Random();
		int rNum = r.nextInt(3);
		if (rNum ==1) {
			return "찌";
		}if (rNum == 2) {
			return "묵";
		}if (rNum ==3) {
			return "보";
		}
		return "";
	}
	
	public static void main(String[] args) {
		String rock = getRock();
		Scanner scan = new Scanner(System.in);
		System.out.println("묵,찌,빠:");
		String urRock = scan.nextLine();
		
		if(rock.equals(urRock)) {
			System.out.println("비김");
		} else if((rock.equals("찌") && urRock.equals("묵"))
			|| (rock.equals("묵") && urRock.equals("보"))
			|| (rock.equals("보") && urRock.equals("가위"))) {
			System.out.println("이김");
		}else {
			System.out.println("짐");
		}
		
		
			
		}
	}
