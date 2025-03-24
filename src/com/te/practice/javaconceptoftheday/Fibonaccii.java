package com.te.practice.javaconceptoftheday;

public class Fibonaccii {
	public static void main(String[] args) {

		// 0 1 2 3 5 8 13
		int n = 10;
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;

		}
	}
}
