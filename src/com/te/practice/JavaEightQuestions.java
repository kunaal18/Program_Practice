package com.te.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightQuestions {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(12);
		list.add(87);
		list.add(45);
		list.add(10);

		// ODD Even
		List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
