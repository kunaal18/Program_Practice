package com.te.practice;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int ar[] = { 23, 45, 12, 78, 1, 67 };
		
		int min = Arrays.stream(ar).map(i->i).summaryStatistics().getMin();
		
		
	}
}
