package p01;

public class StringCondition {

	public static void main(String[] args) {
		String s1 = "123";
		if(s1 == "123") {
			System.out.println("s1은 123");
		} else {
			System.out.println("s1은 123이 아님");
		}
		String s2 = new String("123");
		if(s2 == "123") {
			System.out.println("s2는 123");
		} else {
			System.out.println("s2는 123이 아님"); //s2는 다른 메모리주소에 있기 때문
		}
		String s3 = "";
		System.out.println(s3.equals(" "));
		
		String s4 = " 123 ";
		System.out.println(" 123 ".trim()); //trim은 빈 문자열 제거 
		
		String s5 = new String("1");
		System.out.println("1".equals(s5));
		System.out.println(s5.equals("1")); //이 방법은 지양함
		
		String s6 = null;
		System.out.println("");
	}
}
