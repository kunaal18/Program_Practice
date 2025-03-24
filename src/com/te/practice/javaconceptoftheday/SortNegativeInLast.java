package com.te.practice.javaconceptoftheday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNegativeInLast {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 43, -3, 76, -12, -89, 45);

		List<Integer> collect = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
