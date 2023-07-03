package p06;
/*
 * 선택정렬
 * */

public class SortTest {
	
	public static void main(String[] args) {
		int[] nums = new int[] {10,7,15,1,4};
		System.out.println("정렬 전");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i] + ",");
			int min = nums[i];
			int idx = i;
			for(int j=i+1; j<nums.length; j++) {
				if(min>nums[i]) {
					min = nums[i];
					idx = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[idx];
			nums[idx]= tmp;
			}
			System.out.println("정렬 후");
			

	}
}

				


