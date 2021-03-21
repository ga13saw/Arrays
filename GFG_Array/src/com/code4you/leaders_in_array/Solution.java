package com.code4you.leaders_in_array;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10,4,3,6,5,2};
		leaderElement(arr);
	}
	
	//Element after that all values are smaller is called leader element.
	//Element greater than all next values is leader element.
	
	//TC: O(n)  SC: O(1)
	public static void leaderElement(int[] arr) {
		int right = arr.length-1;
		int current_lead = arr[right--];
		System.out.print(current_lead+" ");
		for (int i = right; i >=0; i--) {
			if (arr[i]>current_lead) {
				current_lead = arr[i];
			System.out.print(arr[i]+" ");	
			}
		}
		System.out.println();
		
	}

}
