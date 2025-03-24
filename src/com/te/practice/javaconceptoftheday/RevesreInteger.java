package com.te.practice.javaconceptoftheday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevesreInteger {
	public static void main(String[] args) {
		int n = 23145;
//		int rev = 0;
//
//		while (n != 0) {
//			int d = n % 10;
//			rev = rev * 10 + d;
//			n = n / 10;
//		}
//		System.out.println(rev);

		String valueOf = String.valueOf(n);
		String collect = Stream.of(valueOf.split("")).map(i -> new StringBuffer(i).reverse())
				.collect(Collectors.joining());
		System.out.println(collect);
	}
}
