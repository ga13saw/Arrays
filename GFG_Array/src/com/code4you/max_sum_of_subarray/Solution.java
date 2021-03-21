package com.code4you.max_sum_of_subarray;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,-2,3,-1,2};
		//int[] arr = {5,8,3};
		int[] arr = {-8,-1,-5};
		System.out.println(maxSumOfSubarray(arr));
		System.out.println(maxSumOfSubarray2(arr));
	}
	
	//TC: O(n^2)
	public static int maxSumOfSubarray(int[] arr) {
		
		int res=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			int curr = 0;
			for (int j = i; j < arr.length; j++) {
				curr+=arr[j];
				res=Math.max(curr, res);
			}
		}
		return res;
	}
	//-8 -1 -5 --> for i =1 choose max(-8-1, -1) , for i=2 max(-1-5,-5)
	// update res when max(-8-1, -1) is max.
	
	public static int maxSumOfSubarray2(int[] arr) {
		int res = arr[0];
		int maxEnding = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}
}







