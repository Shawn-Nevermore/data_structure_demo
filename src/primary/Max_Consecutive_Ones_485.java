package primary;

public class Max_Consecutive_Ones_485 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,1,1,1,0,0,1,1};
		int a = findMaxConsecutiveOnes(arr);
		System.out.println(a);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int sum = 0, max = 0;
		for(int i = 0; i < nums.length; i++) {
			int lastSum = sum;
			sum += nums[i];
			if(sum == lastSum) {
				max = (max < sum) ? sum : max;
				sum = 0;
			}
			
		}
		
		return max;
	}
}
