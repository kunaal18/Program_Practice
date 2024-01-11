package com.te.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Demo {

	// generate a random arraylist collection
	public static List<Integer> randomArrayList() {
		return Stream.generate(() -> new Random().nextInt(100)).limit(10).collect(Collectors.toList());
	}

	// generate a random array of integer
	public static int[] randomArray() {
		return Stream.generate(() -> new Random().nextInt(100)).limit(10).collect(Collectors.toList()).stream()
				.mapToInt(Integer::intValue).toArray();
	}

	// ================================Questions========================================
	// 1. Write a program to find the average of a list of integers using Java 8
	// features.
	public static int avg(int[] array) {
		return Arrays.stream(array).reduce(0, (a, b) -> a + b);
	}

	// ======Note: max() returns Optional
	// 2. Given a list of strings, write a program to find the longest string using
	// Java 8 features
	public static Optional<String> longestString(List<String> listOfStrings) {
		return listOfStrings.stream().max((a, b) -> Integer.compare(a.length(), b.length()));
	}

	// 3.Given a list of Integer, write a program to find the highest integer using
	// java 8 features
	public static Optional<Integer> highestInteger(List<Integer> listOfInteger) {
		return listOfInteger.stream().max((a, b) -> Integer.compare(a, b));
	}

	// 4.Implement a program to count the occurrences of each word in a given
	// sentence using Java 8 features.
	public static Map<String, Long> wordOccurance(String string) {
		return Arrays.stream(string.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	// 5. Implement a program to count the occurrences of each character in a given
	// sentence using Java 8 features.
	public static Map<Character, Long> characterOccurance(String string) {
		return string.chars().filter(i -> i != ' ').mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	// 6. Write a program to remove duplicate elements from an ArrayList using Java
	// 8 features.
	public static List<Integer> removeDuplicateNumber(List<Integer> integers) {
		return integers.stream().distinct().collect(Collectors.toList());
	}

	// 7. Write a program to remove duplicate String from an ArrayList using Java 8
	// features.
	public static List<String> removeDuplicateString(List<String> strings) {
		return strings.stream().distinct().collect(Collectors.toList());
	}

	// 8.Write a program to remove duplicate character from an ArrayList using Java
	// 8 features.
	public static List<Character> removeDuplicateCharacter(String string) {
		return string.chars().filter(i -> i != ' ').mapToObj(i -> (char) i).distinct().collect(Collectors.toList());
	}

	// 9.Write a program to sort a list of strings in descending order of length
	// using Java 8 features.
	public static List<String> sortStringDesc(List<String> strings) {
		return strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
	}

	// 10.Implement a program to find the first non-repeating character in a string
	// using Java 8 features.
	public static Optional<Character> firstNonRepCharacter(String string) {
		return string.chars().filter(i -> i != ' ').mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() == 1).map(i -> i.getKey()).findFirst();
	}

	// 11. Implement a program to find the palindrome count character in a string
	// using Java 8 features.
	public static Long palindromeCount(String string) {
		return Arrays.stream(string.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() >= 2).count();
	}

	// 12. Write a program to check if a given list of strings contains a specific
	// substring using Java 8 features
	public static boolean checkSubstring(List<String> string, String subString) {
		return string.stream().anyMatch(i -> i.contains(subString));
	}

	// 13. Given a list of strings, write a program to count the number of strings
	// starting with a specific letter using Java 8 features.
	public static Optional<Long> countStartWith(List<String> strings, Character character) {
		return Optional.ofNullable(strings.stream().filter(i -> i.startsWith(character + "")).count());
	}

	// 14.Given a list of strings, write a program to concatenate all strings into a
	// single string using Java 8 features.
	public static String concatenateStrings(List<String> strings) {
		return strings.stream().filter(Objects::nonNull).reduce("", (a, b) -> a + b);
	}

	// 15. Write a program to find the average length of strings in a list using
	// Java 8 features.
	public static Optional<Integer> avglengthOfStrings(List<String> strings) {
		return Optional
				.ofNullable(strings.stream().filter(Objects::nonNull).map(i -> i.length()).reduce(0, (a, b) -> a + b));
	}

	// 16.Write a program to find the maximum and minimum values in a list of
	// integers using Java 8 features.
	public static Optional<List<Integer>> maxMinFromList(List<Integer> integers) {
		return Optional.ofNullable(integers.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			Optional<Integer> max = list.stream().max(Integer::compareTo);
			Optional<Integer> min = list.stream().min(Integer::compareTo);
			return Arrays.asList(max.orElse(null), min.orElse(null));
		})));
	}

	// ========Note: reduce() having one parameter, retuns optional
	// 17. Given a list of strings, write a program to find the shortest string
	// using the reduce operation.
	public static Optional<String> shortestString(List<String> strings) {
		return strings.stream().filter(Objects::nonNull).reduce((a, b) -> a.length() < b.length() ? a : b);
	}

	// 18. Implement a program to count the number of occurrences of a specific
	// character in a list of strings.
	public static Long NumberOfOccurance(List<String> strings, Character character) {
		return strings.stream().filter(Objects::nonNull).flatMapToInt(CharSequence::chars).filter(i -> i == character)
				.count();
	}

	// 19. Sort a list of Integer in ascending order using comparable interface in
	// stream api.
	public static List<Integer> sortAsceComparable(List<Integer> integers) {
		return integers.stream().filter(Objects::nonNull).sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
	}

	// 20. Sort a list of Integer in ascending order using comparator interface in
	// stream api.
	public static List<Integer> sortAsceComparator(List<Integer> integers) {
		return integers.stream().filter(Objects::nonNull).sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
	}

	// 21. Sort a list of Integer in descending order using comparator interface in
	// stream api.
	public static List<Integer> sortDescComparator(List<Integer> integers) {
		return integers.stream().filter(Objects::nonNull).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(randomArrayList() + " : " + randomArrayList().getClass().getName());
		System.out.println(Arrays.toString(randomArray()) + " : " + randomArray().getClass().getName());
		int[] array = randomArray();
		System.out.println("Average of an array: " + Arrays.toString(array) + " is " + avg(array));
		List<String> strings = Arrays.asList("abc", "def", "def", "ghi78", "jkl45", "ab");

		System.out.println(longestString(strings).isPresent() ? "longest String: " + longestString(strings).get()
				: "..............");
		List<Integer> listOfInt = randomArrayList();
		System.out.println(listOfInt);
		System.out.println(highestInteger(listOfInt).isPresent() ? "highest Integer: " + highestInteger(listOfInt).get()
				: ".......");
		System.out.println(wordOccurance("hii mam mam"));
		System.out.println(characterOccurance("hii mam mam"));
		System.out.println(removeDuplicateNumber(listOfInt));
		System.out.println(removeDuplicateString(strings));
		System.out.println(removeDuplicateCharacter("hii mam mam"));
		System.out.println(sortStringDesc(strings));
		System.out.println(firstNonRepCharacter("hhii mam mam").isPresent()
				? "first non-repeating character is " + firstNonRepCharacter("hhii mam mam").get()
				: "every character is repeated");
		System.out.println(palindromeCount("Hii mam mam"));
		System.out.println(checkSubstring(strings, "defd"));
		System.out.println(
				countStartWith(strings, 'z').isPresent() ? "words start with: " + countStartWith(strings, 'z').get()
						: "no any word start with the given character");
		System.out.println(concatenateStrings(strings));
		System.out.println(
				avglengthOfStrings(strings).isPresent() ? avglengthOfStrings(strings).get() : "no strings present");
		List<Integer> integers = Arrays.asList(4, 5, 6, 1, 2, 7, 8, 9);
		System.out.println(maxMinFromList(integers).isPresent()
				? "maximum and minimum values are: " + maxMinFromList(integers).get()
				: "no output");
		System.out.println(shortestString(strings).isPresent() ? shortestString(strings).get() : "......");
		System.out.println(NumberOfOccurance(strings, 'a'));
		System.out.println(sortAsceComparable(integers));
		System.out.println(sortAsceComparator(integers));
		System.out.println(sortDescComparator(integers));

	}
}
