package com.code4you.sort_array_check;

public class Solution {

	public static void main(String[] args) {
		//int[] arr = {2,4,6,8,9,10};
		int[] arr = {4,2,6,5,8}; 
		//int[] arr = {1,1,1,1,1};
		//int[] arr = {8,6,4,3,1};
		System.out.println(isArraySorted2(arr));
	}
	
	//for array sorted in ascending order  TC: O(n)   SC: O(1)
	public static boolean isArraySorted(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	//for array sorted in descending order
	public static boolean isArraySorted2(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]<arr[i+1]) {
				flag =false;
				break;
			}
		}
		return flag;
	}
}
