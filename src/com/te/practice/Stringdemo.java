package com.te.practice;

public class Stringdemo {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		String s2 = new String("abc");

		StringBuffer sb1 = new StringBuffer("abc");
		String sb2 = "abc";
		System.out.println(s == s1);

		System.out.println(s.concat(s1));

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(sb1.equals(s1));
	}
}
