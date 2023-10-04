package treeset1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates the usage of a TreeSet.
 */
public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> stringSet = new TreeSet<String>();
		
		for(String s: "9 8 7 6 5 4 3 2 1 11 22 33 44 55 66 77 99 88".split(" ")) {
			stringSet.add(s);
		}
		
		System.out.println(stringSet);

		Set<Integer> intSet = new TreeSet<Integer>();
		for(String s: "9 8 7 6 5 4 3 2 1 11 22 33 44 55 66 77 99 88".split(" ")) {
			intSet.add(Integer.parseInt(s));
		}
		
		System.out.println(intSet);
		
		Set<Integer> smallerAsIntSet = ((TreeSet<Integer>)intSet).headSet(22);
		System.out.println(smallerAsIntSet);
		
		Set<Integer> greaterAsIntSet = ((TreeSet<Integer>)intSet).tailSet(22);
		System.out.println(greaterAsIntSet);
		
		Set<Integer> subIntSet = ((TreeSet<Integer>)intSet).subSet(8,66);
		System.out.println(subIntSet);
	}

}
