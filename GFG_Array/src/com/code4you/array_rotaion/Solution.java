package com.code4you.array_rotaion;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 2, 8, 1, 9 };

		// int[] reverse = rotate2(arr, 3);
		// int[] reverse = rotate(arr);
		// int[] reverse = rotate3(arr,arr.length+4);
		int[] rotateUsingReverse = rotateUsingReverse(arr, 2);
		for (int i : rotateUsingReverse) {
			System.out.print(i + " ");
		}
	}

	// rotate array clockwise by one TC: O(n) and SC:O(1)
	public static int[] rotate(int[] arr) {
		int first_ele = arr[0];
		for (int j = 1; j < arr.length; j++) {
			arr[j - 1] = arr[j];
		}
		arr[arr.length - 1] = first_ele;

		return arr;
	}

	// Reverse first d elements if d<array len n then TC: O(d*n) and SC:O(1)
	public static int[] rotate2(int[] arr, int d) {
		for (int i = 0; i < d; i++) {
			int first_ele = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = first_ele;
		}
		return arr;
	}

	// Reverse first d elements if d>array len n then TC: O(d*n) and SC:O(1)
	public static int[] rotate3(int[] arr, int d) {
		d = d % arr.length;
		for (int i = 0; i < d; i++) {
			int first_ele = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = first_ele;
		}
		return arr;
	}

	// rotate using reverse method
	public static int[] rotateUsingReverse(int[] arr, int d) {
		// reverse upto d-1 position
		reverse(arr, 0, d - 1);

		// reverse from d to <lenght position
		reverse(arr, d, arr.length - 1);

		// reverse from 0 to d-1 position
		reverse(arr, 0, arr.length - 1);

		return arr;
	}

	// reverse method
	private static void reverse(int[] arr, int i, int j) {
		int left = i;
		int right = j;
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

	}
}
