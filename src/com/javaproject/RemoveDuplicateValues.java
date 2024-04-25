package com.javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValues {
	public static void main(String[] args) {

		ArrayList<Integer> listWithDuplicates = new ArrayList<>();
		// Populate listWithDuplicates with data including duplicates
		listWithDuplicates.addAll(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5, 5, 6));

		// Convert the ArrayList to a LinkedHashSet to remove duplicates
		Set<Integer> set = new LinkedHashSet<>(listWithDuplicates);

		// Clear the original list and add back the unique elements
		listWithDuplicates.clear();
		listWithDuplicates.addAll(set);

		// Now listWithDuplicates contains only unique elements
		System.out.println("List after removing duplicates: " + listWithDuplicates);

	}

}
