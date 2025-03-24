package com.te.practice.javaconceptoftheday;

import java.util.Arrays;

public class ZeroShiftToRight {

	public static void main(String[] args) {
		int[] ar = { 1, 0, 0, 7, 0, 2, 0, 4 };

		int res[] = new int[ar.length];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				res[count] = ar[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
