package p08;

public class RemocornExec {

	public static void main(String[] args) {
		
		Remote[] remotes = new Remote[2];
		remotes[0] = new AirconRemocorn();
		remotes[1] = new TvRemocorn();
		
		for(int i=0; i<remotes.length; i++) {
			if(remotes[i] instanceof AirconRemocorn ) {
				AirconRemocorn ar = (AirconRemocorn)remotes[i];
				ar.tempDown();
				ar.tempUp();				
			}else if(remotes[i] instanceof TvRemocorn) {
				TvRemocorn tv = (TvRemocorn)remotes[i];
				tv.chDown();
				tv.chUp();
			}
			remotes[i].off();
		}
		
	}
}


/*
 * if(p1 instanceof BallPen) {
			BallPen bp = (BallPen)p1;
			bp.changeBall();
		}
		if(p2 instanceof BallPen) {
			BallPen bp = (BallPen)p2;
			bp.changeBall();
 */


/*
 * A void Test("1") 은 A,object로 불림
 * B extends A voidtest("2")는 A,B,Object로 불림
 * c extends B voidtest("3")은 A,B,C,object로 불림
 */
