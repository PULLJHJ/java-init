package p11;

class Test{
	public final void test() {  //method에 final이 붙을 경우 overriding 불가. class앞에 final이 붙을 경우 extends가 안됨
		System.out.println("난 TEST꺼");
	}
}

public class FinalTest extends Test{
//	public final void test() {
//		System.out.println("난 FinalTest꺼!");
//	}
	
	public static void main(String[] args) {
		int num = 1;
		num = 2;
	}

}
