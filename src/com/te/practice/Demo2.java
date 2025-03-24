package com.te.practice;

public class Demo2 {
	public boolean m1(int age) {
		if (age >= 18) {
			return true;
		}
		return false;
	}

	public String m1(String age) {
		int parseInt = Integer.parseInt(age);
		if (parseInt >= 18) {
			return "yes";
		}
		return "no";
	}

	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		System.out.println(demo2.m1(100));
		System.out.println(demo2.m1("10"));

	}
}
