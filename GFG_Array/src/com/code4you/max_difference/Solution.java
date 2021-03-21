package com.code4you.max_difference;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,10,64,8,1};
		//int[] arr = {10,20,30};
		//int[] arr = {30,20,8,2};
		//int[] arr = {7,9,5,6,3,2};
		//int[] arr = {2,0,3,7,1,8};
 		System.out.println(maxDifference(arr));
	}
	
	public static int maxDifference(int[] arr) {
		
		int min = arr[0];
		int maxDiff = arr[1] - min;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i-1] < min ) {
				min = arr[i-1];
			}
			if (maxDiff < arr[i] - min) {
				maxDiff = arr[i] - min;
			}
			
		}
		return maxDiff;
	}
	
}
