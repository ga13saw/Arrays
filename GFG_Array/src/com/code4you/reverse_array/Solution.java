package com.code4you.reverse_array;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,2,8,1,9};
		int[] reverse = reverse(arr);
		
		for (int i : reverse) {
			System.out.print(i+" ");
		}
	}
	
	//time complexity: O(n)   space com : O(1)
	public static int[] reverse(int[] arr) {
		int left = 0;
		int right = arr.length-1;		
		while (left<= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}		
		return arr;
	}
	
	
}
