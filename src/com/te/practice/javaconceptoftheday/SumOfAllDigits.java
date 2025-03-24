package com.te.practice.javaconceptoftheday;

public class SumOfAllDigits {
	public static void main(String[] args) {
		int n = 12345;

		int sum = 1;
		while (n != 0) {
			int d = n % 10;
			sum = sum * d;
			n = n / 10;
		}
		System.out.println(sum);

	}
}
