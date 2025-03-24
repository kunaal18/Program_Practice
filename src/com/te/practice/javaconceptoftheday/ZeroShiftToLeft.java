package com.te.practice.javaconceptoftheday;

import java.util.Arrays;

public class ZeroShiftToLeft {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 0, 0, 0, 5 };
		int count = ar.length - 1;
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] != 0) {
				ar[count] = ar[i];
				count--;
			}
		}

		while (count >= 0) {
			ar[count] = 0;
			count--;
		}
		System.out.println(Arrays.toString(ar));
	}
}
