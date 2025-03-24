package com.te.practice.javaconceptoftheday;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prg3_DublivateInString {
	public static void main(String[] args) {
		String st = "programming";
//		String collect = st.chars().distinct().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());
//		System.out.println(collect);
//		
		Map<String, Long> collect = Stream.of(st.split(""))
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		collect.entrySet().stream().filter(i -> i.getValue() > 1).forEach(i -> {
			System.out.println(i.getKey() + "--->" + i.getValue());
		});
	}
}
