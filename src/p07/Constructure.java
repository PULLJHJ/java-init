package p07;

import java.util.Scanner;

public class Constructure {

	public Constructure(){          //생성자    생성자는 데이터타입이 없음 생성자도 오버로딩이 가능. new를 해야 사용가능.
		System.out.println("어 나 불렀어?");  // 5~7번째 줄이 기본 생성자임 근데 생성을 안하는 이유는 원래 기본으로 생성되고 우리 눈에 안보이기 때문.
	}
	
	public Constructure(int num) {
		System.out.println("어? 나 int num불렀어?");
	}
	public static void main(String[] agrs) {
		Constructure c = new Constructure();
		Scanner scan = new Scanner(System.in);  // Scanner는 기본 생성자가 없어서 ()안에 System.in을 넣어줘야 함.
		
	}
}

