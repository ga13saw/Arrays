package com.code4you.consecutive_one;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,0,1,1,0,0,1,1};
		//int[] arr = {1,1,1,1};
		int[] arr = {1,1,1,1,0,1};
		//int[] arr = {0,0,0};
		System.out.println(consecutiveOne(arr));
		System.out.println(consecutiveOne2(arr));
		System.out.println(consecutive1(arr));
		
	}
	public static int consecutiveOne(int[] arr) {
		int count=0;
		int res=0;
		for(int i =0; i<arr.length;i++) {
			while (i<arr.length && arr[i] ==1) {
				count++;
				i++;
			}
			
			res=Math.max(count, res);
			count=0;
		}
		return res;
	}
	
	public static int consecutiveOne2(int[] arr) {		
		int res=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==0) {
				count=0;
				
			}
			else{
				count++;
				res=Math.max(res, count);
			}
		}
		return res;
	}
	
	//O(n)
	public static int consecutive1(int[] arr ) {
		int res=0,count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				count++;
				continue;
			}
			
			res=Math.max(res, count);
		}
		return res;
	}
	
	
}
