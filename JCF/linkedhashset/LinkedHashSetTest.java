package linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates the different ways to store elements with LinkedHashSet, TreeSet and HashSet.
 */
public class LinkedHashSetTest {

	public static void main(String[] args) {
	
		Set<String> stringSet = new LinkedHashSet<String>();
		
		for(String s: "1 3 5 7 9 2 4 6 8 10".split(" ")) {
			stringSet.add(s);
		}
		
		System.out.println("LinkedHashSet: ");
		System.out.println(stringSet);
		
		for(String s: stringSet) {
			System.out.printf("%s ",s);
		}
		System.out.printf("%n");
	
		// -------------------------------------------
		Set<String> stringHashSet = new HashSet<String>();
		
		for(String s: "1 3 5 7 9 2 4 6 8 10".split(" ")) {
			stringHashSet.add(s);
		}
	
		System.out.println("HashSet: ");
		System.out.println(stringHashSet);
		
		for(String s: stringHashSet) {
			System.out.printf("%s ",s);
		}
		System.out.printf("%n");
		
		// -------------------------------------------
		Set<String> stringTreeSet = new TreeSet<String>();
		
		for(String s: "1 3 5 7 9 2 4 6 8 10".split(" ")) {
			stringTreeSet.add(s);
		}

		System.out.println("TreeHashSet: ");
		System.out.println(stringTreeSet);
		
		for(String s: stringTreeSet) {
			System.out.printf("%s ",s);
		}
		System.out.printf("%n");

	}

}
