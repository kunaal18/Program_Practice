package com.te.practice.javaconceptoftheday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevesreStringIndiv {
	public static void main(String[] args) {
		String st = "Happy day";

		String collect = Stream.of(st.split(" ")).map(i -> new StringBuffer(i).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(collect);
		
		
		
		
		
	}

}
