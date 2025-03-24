package com.te.practice.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	// the map method in java stram api is used to transform ecah element in astream
	// into another object or value in java. is its intermediate
	public static void main(String[] args) {

		List<Employee> asList = Arrays.asList(new Employee(1, "Kunal", 25), new Employee(2, "Sumeet", 27),
				new Employee(4, "manish", 26), new Employee(3, "Abhishek", 28));
		List<Integer> asList2 = Arrays.asList(1, 2, 3, 4, 5, 67, 78, 32);

		List<Employee> collect = asList.stream().filter(i -> i.getAge() > 25).collect(Collectors.toList());

		System.out.println(collect);

		List<Integer> collect2 = asList2.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(collect2);

	}
}
