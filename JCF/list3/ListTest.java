package list3;

import java.util.LinkedList;

/**
 * Random access to specific elements of a LinkedList.
 */
public class ListTest {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.addFirst(1);
		System.out.println(l);
		l.addFirst(2);
		System.out.println(l);
		l.addLast(3);
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
	}
}
