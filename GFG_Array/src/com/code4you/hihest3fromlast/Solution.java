package com.code4you.hihest3fromlast;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// float[] racers = {(float) 49.195,(float) 42.0,35,10,11,55};
		/*
		 * float[] racers = {35,23,56}; float[] result = result(racers); for
		 * (float f : result) { System.out.print(f+" "); }
		 */
		double[] racers = { 4, 1, 6, 3, 5, 7 };
		System.out.println(maxProd(racers));
		System.out.println(maxProdRevised(racers, 4));
	}

	public static float[] result(float[] racers) {
		float d = 49.195f;

		if (racers.length < 3) {
			float[] resu = new float[2];
			int j = 0;
			for (int i = racers.length - 1; i >= 0; i--) {
				if (racers[i] < d && j <= 2) {
					resu[j++] = racers[i];
				}
			}

			return resu;
		}

		float[] resu = new float[3];
		
		//use optimized sorting algo ex: 
		//Arrays.sort(racers);
		for (int i = 0; i < racers.length; i++) {
			for (int j = i + 1; j < racers.length; j++) {
				if (racers[i] > racers[j]) {
					float temp = racers[i];
					racers[i] = racers[j];
					racers[j] = temp;
				}
			}
		}
		int j = 0;
		for (int i = racers.length - 1; i >= 0; i--) {
			if (racers[i] < d && j <= 2) {
				resu[j++] = racers[i];
			}
		}

		return resu;

	}

	// calculate product of last 4 element	O(n^2)
	public static double maxProd(double[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					double temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		double prod = 1;
		int j = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (j <= 4) {
				prod *= nums[i];
				j++;
			}

		}

		return prod;
	}

	// calculate product of last 4 element   O(nlon(n))
	public static double maxProdRevised(double[] nums, int element) {

		// sort array
		Arrays.sort(nums);
		double prod = 1;
		int arrLen = nums.length;
		for (int i = arrLen - 1; i >= arrLen - element; i--) {
			prod *= nums[i];
		}
		return prod;
	}

}
