package p09;

public class SortTest2 {

	public static void main(String[] args) {

		int[] num = new int[] {10,18,35,17,4};
		
		if(num[0]>num[1]) {
			int tmp = num[0];
			num[0] = num[1];
			num[1] = tmp;
		}
		if(num[0]>num[2]) {
			int tmp = num[0];
			num[0] = num[2];
			num[2] = tmp;
		}
		if(num[0]>num[3]) {
			int tmp = num[0];
			num[0] = num[3];
			num[3] = tmp;
		}
		if(num[0]>num[4]) {
			int tmp = num[0];
			num[0] = num[4];
			num[4] = tmp;
		}
		if(num[1]>num[2]) {
			int tmp = num[1];
			num[1] = num[2];
			num[2] = tmp;
		}
		if(num[1]>num[3]) {
			int tmp = num[1];
			num[1] = num[3];
			num[3] = tmp;
		}
		if(num[1]>num[4]) {
			int tmp = num[1];
			num[1] = num[4];
			num[4] = tmp;
		}
		if(num[2]>num[3]) {
			int tmp = num[2];
			num[2] = num[3];
			num[3] = tmp;
		}
		if(num[2]>num[4]) {
			int tmp = num[2];
			num[2] = num[4];
			num[4] = tmp;
		}
		if(num[3]>num[4]) {
			int tmp = num[3];
			num[3] = num[4];
			num[4] = tmp;
		}
		System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4]);	
		
		
		
	}

}
