package com.linkedin.collections;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);
		NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

		numberTree.stream().forEach(System.out::println); // streams all elemets of tree set
		System.out.println("\n");
		numberTree.headSet(1750).stream().forEach(System.out::println); // streams elements less then head set
		System.out.println("\n");
		numberTree.tailSet(1750).stream().forEach(System.out::println);// streams elements greater then tail set
		System.out.println("\n");
		numberTree.subSet(1000,2500).stream().forEach(System.out::println); // streams a subset
	}
}
