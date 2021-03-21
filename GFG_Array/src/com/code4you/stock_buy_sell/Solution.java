package com.code4you.stock_buy_sell;

public class Solution {

	public static void main(String[] args) {
		//int[] arr = {2,5,6,7,1,2,8};
		//int[] arr = {1,5,3,8,12};
		//int[] arr = {30,20,10};
		int[] arr = {1,5,3,1,2,8};
		// TODO Auto-generated method stub
		System.out.println(buySellStock(arr ));
	}
	
	// calculates maximum profit--> buy at low and sell at high any no. of times
	public static int buySellStock(int[] arr) {
		int maxProfit = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]>arr[i]) {
				maxProfit+=arr[i+1]-arr[i];
			}
		}
		return maxProfit;
	}
}
