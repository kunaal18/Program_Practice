package com.te.practice;

import java.util.Arrays;

public class MoveZeroToFirst {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 0, 0, 1, 0 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
