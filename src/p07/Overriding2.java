package p07;

class Mother{
	public void work() {
		System.out.println("어머님이 집안일을 하십니다.");  //1. 바드시 extends나 implements를 해야만 오버라이딩이라고 부를 수 있다.
	}                                                //2. 반드시 extends해야만한다.
}                                                    //3. 메서드의 이름과 데이터 타입이 반드시 같아야한다.
class Daughter extends Mother{      // Mother이 상위 클래스, Daughter이 mother를 가지고 있음         upcasting만 자동으로 되고 downcasting은 안됨.
	public void work() {
		System.out.println("딸이 출근을 합니다.");
	}
	
	public void work(String job) {
		System.out.println("딸이 " + job + "을 합니다.");
	}
}
public class Overriding2 {
	public static void work(Mother[] ms) {
		for(int i=0; i<ms.length; i++) {
			Mother m = ms[i];
			if(m instanceof Daughter) {       //m이 Daughter 로 불릴 수 있다면 딸이 개발을 합니다
				Daughter d = (Daughter)m;
				d.work("개발");			
			}
		}
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		
		Mother m = new Mother();
		
		Mother[] ms = new Mother[2];
		ms[0] = m;
		ms[1] = d;
		work(ms);
		System.out.println(d instanceof Mother); // instance of d를 mother라고 불러도 되니? 라는 뜻
		//System.out.println(m instanceof Mother);
		
	}
	
}
