package com.code4you.frequency_in_sorted_array;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {2,2,3,6,6,6,9,9,10};
		//int[] arr = {10,10,10,10};
		int[] arr = {10,20,30};
		findFrequency(arr);
	}
	
	//TC: O(n^2) SC:(1) --this is for sorted array
	public static void findFrequency(int[] arr) {
		int count;
		for (int i = 0; i < arr.length; i+=count) {
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println("frequency of "+ arr[i] + " is "+count);
		}
	}
	
	//TC: O(n)  SC: O(1)
	public static void findFrequency2(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			int current_ele = arr[i];
			int count =1;
			while (arr[i+1] == current_ele) {
				count++;
				i++;
			}
			System.out.println("frequency of "+ current_ele + " is "+count);
		}
	}

}
