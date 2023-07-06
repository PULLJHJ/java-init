package p08;

public class Remocorn implements Remote{
// Remocorn, Remote, Object로 불릴 수 있음.
	@Override
	public void on() {
		System.out.println("킵니다.");
	}

	@Override
	public void off() {
		System.out.println("끕니다.");
	}

	@Override
	public void tempUp() {
	}

	@Override
	public void tempDown() {
	}

	@Override
	public void chUp() {
	}

	@Override
	public void chDown() {
	}

	
}
