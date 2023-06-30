package p05;

public class HumanExec {

	public static void main(String[] args) {
		Human[] h = new Human[5];
		h[0] = new Human();
		h[0].name = "정해준";
		h[0].money = 15000;
		
		h[1] = new Human();
		h[1].name = "홍길동";
		h[1].money = 2000;

		h[2] = new Human();
		h[2].name = "김철수";
		h[2].money = 16000;
		
		h[3] = new Human();
		h[3].name = "김영희";
		h[3].money = 8000;
		
		h[4] = new Human();
		h[4].name = "엄북동";
		h[4].money = 9000;
		
		
		int sum = 0;
		for(int i=0; i<h.length; i++) {
			sum += h[i].money;
		}
		
		int average = 0;
		average = sum / h.length;
		for(int i=0; i<h.length; i++) {
			if(h[i].money > average) {
				System.out.println("평균이상인 사람은: " + h[i].name);
			}
		}
		System.out.println("총액: " + sum);
		System.out.println("평균: " + average);
	}

}
