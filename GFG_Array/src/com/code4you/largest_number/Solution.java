package com.code4you.largest_number;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,8,1,55,6,0};
		System.out.println(largestNum(nums));
	}
	
	//time complexity: O(n)    space complexity: O(1)
	public static int largestNum(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
