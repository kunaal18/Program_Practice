package com.te.practice.javaconceptoftheday;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonrepeatedCharacters {

	public static void main(String[] args) {
		String st = "Java articles are jAwesome";

		Set<Entry<String, Long>> entrySet = Stream.of(st.split("")).map(j -> j.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			if (entry.getValue() == 1) {
				System.out.println(entry);
				break;
			}
		}

	}
}
