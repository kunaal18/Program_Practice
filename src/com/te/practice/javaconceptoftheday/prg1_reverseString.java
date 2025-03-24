package com.te.practice.javaconceptoftheday;

public class prg1_reverseString {

	public static String getRev(String st) {
		if ((st == null) || (st.length() <= 1)) {
			return st;
		}
		return getRev(st.substring(1)) + st.charAt(0);

	}

	public static void main(String[] args) {
		String st = "programming";

		StringBuffer reverse = new StringBuffer(st).reverse();
		System.out.println(reverse);

//		for (int i = st.length() - 1; i >= 0; i--) {
//			System.out.print(st.charAt(i));
//		}

//		StringBuffer stringBuffer = new StringBuffer(st);
//		System.out.println(stringBuffer.reverse());
		System.out.println(getRev(st));
	}

}
