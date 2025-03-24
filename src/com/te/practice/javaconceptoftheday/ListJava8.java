package com.te.practice.javaconceptoftheday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ListJava8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 10, 49, 25, 98, 25);
//
//		// find dublicate
//		HashSet<Integer> hashSet = new HashSet<>();
//		list.stream().filter(i -> !hashSet.add(i)).forEach(System.out::println);
//
//		Integer integer = list.stream().max(Integer::compareTo).get();
//		System.out.println(integer);

		Integer integer = list.stream().sorted((i, j) -> i - j).findFirst().get();
		System.out.println(integer);

		String st = "Software System Solution";
	}

}
