package com.te.practice.javaconceptoftheday;

public class ReplaceCharacter {
	public static void main(String[] args) {
		String input = "Spring Boot is Superb!";
		String output = input.replaceAll("[Ii]", "\\$"); // Using regex for both 'S' and 's'
		System.out.println("Modified String: " + output);
	}
}
