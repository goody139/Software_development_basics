package list1;

import java.util.ArrayList;
import java.util.List;

/**
 * Using an ArrayList and a List-View by means of subList().
 */
public class ListTest {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		
		// add some integers into our ArrayList
		for(String s: "11 22 33 44 55 66 77 88 99 11".split(" "))
			l.add(Integer.parseInt(s));
		
		System.out.println(l);
		
		// subList() returns a view of the portion of this list between the 
		// specified fromIndex, inclusive, and toIndex, exclusive.
		// together with clear() the following removes a range of elements from a list:
		l.subList(2, 5).clear();
		
		System.out.println(l);
		
		// returns the lowest index, i.e. the index of the first occurrence of the specified element
		System.out.printf("The index of 11 is: %d%n", l.indexOf(11));
		
		System.out.printf("The last index of 11 is: %d%n", l.lastIndexOf(11));		
		
		System.out.printf("The index of 11 in the second half is: %d%n", l.subList(l.size()/2,l.size()).indexOf(11));		
	}

}
