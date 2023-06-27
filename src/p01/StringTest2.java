package p01;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "kyundonguniversity";
		char c = str.charAt(5);
		System.out.println(c);
		
		String s1 = "1";    //s1과 s2는 같은 메모리에 있지만 s3는 new String으로 다른메모리에 생성했기 때문에 flase값이 나옴.
		String s2 = "1";    // s3과 s4도 같은 의미.
		System.out.println(s1==s2);
		String s3 = new String("1");
		System.out.println(s1==s3);
		String s4 = new String("1");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		int idx = str.indexOf("y");
		System.out.println(idx);
		int idx2 = str.indexOf("o");
		System.out.println(idx2);
		String str2 = str.substring(idx);
		System.out.println(str2);
		str2 = str.substring(idx, idx2); //idx = yund - idx2 = onguniversity 
		System.out.println(str2);
		str = str.replace("k", "one");
		System.out.println(str);
		
		String name = "jung";
		name = name.toUpperCase();
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
	}
}