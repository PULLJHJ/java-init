package p07;

class Pen{
	public void wirte() {
		System.out.println("펜으로 습니다.");
	}
}
class BallPen extends Pen{
	public void wirte() {
		System.out.println("볼펜으로 씁니다.");
	}

public void changeBall() {
	System.out.println("볼펜을 갈아낍니다.");
}
}
public class InstanceofTest {
	
	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new BallPen();
		
		System.out.println(p1 instanceof Pen);//true
		System.out.println(p2 instanceof Pen);//true
		
		System.out.println(p1 instanceof BallPen);//false
		System.out.println(p2 instanceof BallPen);//true
		
		if(p1 instanceof BallPen) {
			BallPen bp = (BallPen)p1;
			bp.changeBall();
		}
		if(p2 instanceof BallPen) {
			BallPen bp = (BallPen)p2;
			bp.changeBall();
		}
	}
}



