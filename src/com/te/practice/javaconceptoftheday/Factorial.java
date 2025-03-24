package com.te.practice.javaconceptoftheday;

public class Factorial {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int n = 10;

		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;

		}

	}
}
