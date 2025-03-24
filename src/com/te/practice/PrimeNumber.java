package com.te.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i < n / 2; i++) {
			if (i % 2 == 0) {
				System.out.println("Not prime");
				break;
			} else {
				System.out.println("prime");
				break;
			}
		}
	}
}
