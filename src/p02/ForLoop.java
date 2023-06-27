package p02;

public class ForLoop {

	public static void main(String[] args) {
		String[] strs = new String[10];
		
		for(int i=1; i<2; i++) {
			for(int j=0; j<10; j++) {
				strs[i] = Integer.toString(i*j);
				System.out.println(strs[i]);
			}
		
	}
}
}
