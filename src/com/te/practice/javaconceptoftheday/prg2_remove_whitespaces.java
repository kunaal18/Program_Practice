package com.te.practice.javaconceptoftheday;

public class prg2_remove_whitespaces {
	public static void main(String[] args) {
		String st = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";

		String replaceAll = st.replaceAll("\\s", "");
		System.out.println(replaceAll);
	}
}
