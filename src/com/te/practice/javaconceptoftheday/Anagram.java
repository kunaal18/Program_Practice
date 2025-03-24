package com.te.practice.javaconceptoftheday;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		char[] charArray = s1.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		char[] charArray2 = s2.toLowerCase().toCharArray();
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray, charArray2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isan(String s1, String s2) {

		int count[] = new int[128];
		int count1[] = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			count1[s2.charAt(i)]++;
		}

		for (int i = 0; i < 128; i++) {
			if (count[i] != count1[i]) {
				return false;
			}
		}

		return true;
	}

	// both sting contains same element
	public static void main(String[] args) {
		String st1 = "care";
		String st2 = "race";
		// System.out.println(isAnagram(st1, st2));
		System.out.println(isan(st1, st2));
	}
}
