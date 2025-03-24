package com.te.practice.javaconceptoftheday;

public class LongestStringWhichisPalindrome {
	public static boolean isPalindrome(String st) {
		String temp = st;
		boolean res = false;
		String reverse = new StringBuffer(st).reverse().toString();
		if (!reverse.equals(temp))
			return res;
		res = true;
		return res;
	}

	public static void main(String[] args) {

		String st = "abcdcbtfgy";
		String longestPal = "";
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				String substring = st.substring(i, j);
				if (isPalindrome(substring) && substring.length() > longestPal.length()) {
					longestPal = substring;

				}
			}
		}
		System.out.println( longestPal);

	}
}
