package com.code4you.trapping_water;

public class Solution {

	public static void main(String[] args) {
		//int[] arr = {3,0,1,2,5};
		int[] arr = {5,0,6,2,3};
		
		
		//System.out.println(trapping_water(arr));
		System.out.println(trapping_water2(arr));
	}
	
	public static int trapping_water(int[] arr) {
		
		int res = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			int maxL = arr[i];
			for (int j = 0; j < i; j++) {
				maxL = Math.max(maxL, arr[j]);
			}
			
			int maxR = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				maxR = Math.max(maxR, arr[j]);
			}
			
			res+=Math.min(maxL, maxR)- arr[i];
		
		}
		return res;
	}
	
	/*public static int trap_water(int[] arr) {
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			int maxL = arr[i];
			for (int j = 0; j < i; j++) {
				maxL = Math.max(maxL, arr[j]);
			}
			
			int maxR = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				maxR = Math.max(maxR, arr[j]);
			}
			 res+= Math.min(maxL,maxR)  - arr[i];
		}
		return res;
	}*/
	
	public static int trapping_water2(int[] arr) {
		int res=0;
		int n = arr.length;
		int[] lMax = new int[n];
		int[] rMax = new int[n];
		
		lMax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			lMax[i] = Math.max(arr[i], lMax[i-1]);
		}
		
		rMax[n-1] = arr[n-1];
		for (int i = n-2; i >=0; i--) {
			rMax[i] = Math.max(arr[i], rMax[i+1]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			res+=Math.min(lMax[i], rMax[i])-arr[i];
		}
		return res;
	}
}
