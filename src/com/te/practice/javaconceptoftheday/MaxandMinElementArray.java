package com.te.practice.javaconceptoftheday;

import java.util.stream.IntStream;

public class MaxandMinElementArray {

	public static int maxElement(int ar[]) {
		int max = 1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}
		return max;
	}

	public static void main(String[] args) {
		int ar[] = { 2, 35, 2, 1, 456, 21, 6, 521, 3, 5, 2, 1, 3, 4, 5, 43, 3 };
		int min = IntStream.of(ar).summaryStatistics().getMin();
		System.out.println(min);
		System.out.println(maxElement(ar));
	}
}
