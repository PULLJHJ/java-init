package p07;     //

public class OverLoading {    // overloading 전제 조건 같은 영역에 있어야 함. 메서드명 같아야 함. 파라미터 개수가 달라야 함.
	
	public static void test() {
		System.out.println("test() 호출");
	}
	public void test(int num) {                     //int
		System.out.println("test(int num)호출");
	}
	public void test (String str) {                  //string
		System.out.println("test(String str)호출");
	}
	public void test (double db) {                    //double
		System.out.println("test(double db)호출");
	}
	public void test (byte by) {                       //byte
		System.out.println("test(byte by)호출");
	}
	public void test (short sh) {                       //short
		System.out.println("test(short sh)호출");
	}
	public void test (long lo) {                         //long
		System.out.println("test(long lo)호출");
	}
	public void test (float fl) {                        //float
		System.out.println("test(float fl)호출");
	}
	public void test (char ch) {                          //char
		System.out.println("test(char ch)호출");
	}
	public void test (boolean bo) {                       //boolean
		System.out.println("test(boolean bl)호출");
	}

	public static void main(String[] args) {
		
		OverLoading o1 = new OverLoading();
		o1.test("2");   // string
		o1.test(2);     // int
		o1.test(2.1);   // dobule
		o1.test((byte)-128);  //byte
		o1.test((short)1);   //short
		o1.test(1L);     //long
		o1.test(1.1F);     //float
		o1.test('1');     //char
		o1.test(true); //boolean
	}
}
