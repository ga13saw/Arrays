package com.code4you.hihest3fromlast;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		// float[] racers = {(float) 49.195,(float) 42.0,35,10,11,55};
		/*
		 * float[] racers = {35,23,56}; float[] result = result(racers); for
		 * (float f : result) { System.out.print(f+" "); }
		 */
		double[] racers = { 4, 1, 6, 3, 5, 7 };
		System.out.println(maxProd(racers));
	}

	public static float[] result(float[] racers) {
		float d = (float) 49.195;

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
		Arrays.sort(racers);
		int j = 0;
		for (int i = racers.length - 1; i >= 0; i--) {
			if (racers[i] < d && j <= 2) {
				resu[j++] = racers[i];
			}
		}

		return resu;

	}

	public static double maxProd(double[] nums) {

		Arrays.sort(nums);
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

}
