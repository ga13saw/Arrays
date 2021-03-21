package com.code4you.remove_duplicate_element;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {2,5,7,7,9,9,10};
		//int[] removeDuplicate = removeDuplicate(arr);
		int[] removeDuplicate = removeDuplicate2(arr);
		for (int i : removeDuplicate) {
			System.out.print(i+" ");
		}
	}
	
	//time complexity : O(n)  space com: O(1)
	public static int[] removeDuplicate(int[] arr) {
		int index=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[index] != arr[i]) {
				arr[++index] = arr[i];
			}
		}
		for (int i = index+1; i < arr.length; i++) {
			arr[i]=0;
		}
		System.out.println("after removal array size is: "+(index+1));
		return arr;
	}
	
	//time complexity : O(n)  space com: O(n)
	public static int[] removeDuplicate2(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int index = 1;
		for (int i = 1; i < temp.length; i++) {
			if (temp[index-1]!=arr[i]) {
				temp[index++]=arr[i];
			}
		}
		return temp;
	}
	
}
