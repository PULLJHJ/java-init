package p02;

public class ArryTest {

	public static void main(String[] args) {
		
		String[] strNums = new String[10];
		for(int i=0; i<=9; i++) {
			System.out.println(i+ ",");
			System.out.println(i+1);
			strNums[i]= Integer.toString(i+1);
		}
		
		for(int i=0; i<10; i++){
			System.out.println(strNums[i]);
	}
	}
}
