package primary;

import java.util.Arrays;

import utils.RandomArray;

public class Array_Partions_I_561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = RandomArray.randomCommon(0, 100, 6);
		RandomArray.print(nums);

		System.out.println();
		int sum = arrayPairSum(nums);
		System.out.println(sum);

		System.out.println();

		Arrays.sort(nums);
		
		RandomArray.print(nums);

		int newSum = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			newSum += nums[i];
		}
		System.out.println(newSum);
	}

	public static int arrayPairSum(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		int mid = 0, sum = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			sum += nums[i];
		}

		mid = sum / nums.length;

		while (l < r) {
			if (nums[l] > mid || nums[r] > mid) {
				nums[l] = 0;
				nums[r] = 0;
			}
			l++;
			r--;
		}

		for (int i = 0; i < nums.length - 1; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
