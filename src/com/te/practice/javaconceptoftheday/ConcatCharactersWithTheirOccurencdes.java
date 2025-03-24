package com.te.practice.javaconceptoftheday;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatCharactersWithTheirOccurencdes {
	public static void main(String[] args) {

		String st = "aaabbcd";
		Stream.of(st.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().map(i -> i.getKey() + i.getValue()).forEach(System.out::print);

	}
}
