package com.te.practice.javaconceptoftheday;

public class Plaindrome {

	public static boolean isPal(String st) {
		String temp = st;
		int i = 0;
		int j = st.length() - 1;

		while (i < j) {

			if (st.charAt(i) != st.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

	public static boolean nameisPalind(String st) {
		return st.equals(new StringBuffer(st).reverse().toString());

	}

	public static void main(String[] args) {
		String st = "naman";
		System.out.println(isPal(st));
		System.out.println(nameisPalind(st));
	}
}
