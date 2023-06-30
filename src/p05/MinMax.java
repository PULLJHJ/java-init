package p05;

public class MinMax {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6};
		
		int index = 0;
		int min = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(min>nums[i]) {
				min = nums[i];
				index = i;
			}
		}
		System.out.println(index);
		System.out.println(min);
		
		int[] nums1 = new int[] {1,2,3,4,5,6};
		
		int max = nums1[0];
		int index1 = 0;
		for(int i=1; i<nums1.length; i++) {
			if(max<nums1[i]) {
				max = nums1[i];
				index1 = i;
			}
		}
		System.out.println(index1);
		System.out.println(max);
	}
}
