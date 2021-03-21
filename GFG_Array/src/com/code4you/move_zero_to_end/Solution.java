package com.code4you.move_zero_to_end;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {2,3,1,0,6,0,2,3};
		int[] moveToEnd = moveToEnd(arr);
		for (int i : moveToEnd) {
			System.out.print(i+" ");
		}
	}
	//time com: O(n)  space: O(1)
	public static int[] moveToEnd(int[] arr) {
		
		int right = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
		while (arr[right]==0) {
			right--;
		}
			if (arr[i]==0 && i<right) {
				arr[i] = arr[right];
				arr[right] = 0;
				right--;
			}
		}
		
		return arr;
	}
	
	

}
