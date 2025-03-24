package com.te.practice.javaconceptoftheday;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestSubstringWithoutRepeatedDublicate {

	public static boolean isrepeated(String st) {

		Set<Entry<String, Long>> entrySet = Stream.of(st.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
		for (Entry<String, Long> entry : entrySet) {
			if (entry.getValue() > 1)
				return false;

		}
		return true;
	}

	public static void getStr(String st) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j <= st.length(); j++) {
				String substring = st.substring(i, j);
				if (isrepeated(substring)) {
					map.put(substring, substring.length());
				}
			}
		}
		Integer max = Collections.max(map.values());
		map.entrySet().stream().filter(i -> i.getValue() == max).forEach(i -> {
			System.out.println(i.getKey());
		});
	}

	public static void main(String[] args) {
		String st = "Passion";

		getStr(st);
	}
}
