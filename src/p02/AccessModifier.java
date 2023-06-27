package p02;

public class AccessModifier {//접근제어자 public private
	int b = 10;
	public static void main(String[] args) {
		int i= 1;
		System.out.println(i);
		AccessModifier am = new AccessModifier(); //인스턴스화라고 불림, 변수의 초기화
		System.out.println(am.b);
		AccessModifier am1 = new AccessModifier(); //인스턴스화라고 불림, 변수의 초기화
		System.out.println(am1.b);
	}
}
