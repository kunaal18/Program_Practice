package com.te.practice;

public class prg2 {

	static boolean isOddorEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = 223;
		boolean oddorEven = isOddorEven(n);
		System.out.println(oddorEven);
	}
}
