package p07;

class Song{
	public int rank;
	public String title;
	
	public void printTitle()	{
		System.out.println("노래 제목:" + title);
	}
}
	
	/*public static void printSomething() {
		System.out.println("노래 제목 : " + title); //이거는 사용할 수 없음 why? title은 static이 아니기 때문. none static 영역에서는 static none static사용 가능.
	}
}
*/
public class SonExec {

	public static void main(String[] args) {
		Son s = new Son();
		s.name = "동동";
		s.job = "개발자";
		s.age = 30;
		s.hobby = "게임";
		s.printJob();
		s.printHobby();
		Father f = new Father();
		f.name = "홍길동";
		Son s2 = (Son)f;
		s2.hobby = "낚시";
	}
}

