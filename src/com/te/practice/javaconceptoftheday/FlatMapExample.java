package com.te.practice.javaconceptoftheday;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	public static void main(String[] args) {
		List<Company> of = List.of(new Company("TYSS", List.of(new Job("a"), new Job("b"), new Job("c"))),
				new Company("Nexon", List.of(new Job("b"), new Job("a"))));

		 List<List<Job>> collect = of.stream().map(i -> i.getJobs()).collect(Collectors.toList());
		System.out.println(collect);

		of.stream().flatMap(c -> c.getJobs().stream()).map(i -> i.getTitle()).forEach(System.out::println);

	}
}
