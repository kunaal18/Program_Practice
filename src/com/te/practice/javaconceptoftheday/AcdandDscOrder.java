package com.te.practice.javaconceptoftheday;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AcdandDscOrder {

	public static void getAsc(int ar[]) {
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));

	}

	public static void getDesc(int ar[]) {

		int[] array = IntStream.of(ar).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int ar[] = { 2, 35, 2, 1, 456, 21, 6, 521, 3, 5, 2, 1, 3, 4, 5, 43, 3 };
		getAsc(ar);
	}
}
