package com.code4you.second_largest_num;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,8,1,55,6,0};
		System.out.println(secondLargestNum(nums));
	}
	
	//time complexity: O(n)    space complexity: O(1)
	public static int secondLargestNum(int[] arr) {
		int max = 0;
		int second_largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				second_largest=max;
				max=arr[i];
			}
		}
		return second_largest;
	}

}
