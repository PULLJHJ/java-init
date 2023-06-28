package p03;

public class ArrayTest { //변수를 관리하기 쉬움  

	public static void main(String[] args) {
		int[] ages = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] tmp = ages;   // 큰게 작은거로 들어감
		ages = new int[2];
		
		for(int i=0; i<ages.length; i++) {
			System.out.println("ages[" + i + "]: " + ages[i]);
		}
		
		int max = ages.length;
		if(ages.length > tmp.length) {
			max=tmp.length;
		}
		
		for(int i=0; i<max; i++) {
			ages[i] = tmp[i];
		}
		
		

		for(int i=0; i<ages.length; i++) {
			System.out.println("ages[" + i + "]" + ages[i]);
		}
	}

}
