package com.te.practice;

public class Demo {
	public static void main(String[] args) {
		String st = "hi";
		String st1 = "hi";
		String st2 = new String("hi");
		System.out.println(st == st2);
		System.out.println(st.equals(st1));
		System.out.println(st1.equals(st2));
	}
}
