package listcompare1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Compare the performance of an ArrayList and a LinkedList.
 * This comparison is not really fair as we access with an index 
 *   (which is not really suitable for a LinkedList)
 */
public class ListPerformance {

	public static void main(String[] args) {
		
		long time = 0;
		final int MAXVALUES = 50000;
		
		List<Integer> l = new ArrayList<Integer>();
		
		time = System.currentTimeMillis();
		for (int i = 0; i < MAXVALUES; i++) {
			l.add((int) (Math.random() * MAXVALUES));
		}
		System.out.printf(
				"ArrayList: Sequential insert of %d elements took %d milliseconds.%n",MAXVALUES,
				System.currentTimeMillis() - time);

		l = new ArrayList<Integer>();
		time = System.currentTimeMillis();
		for (int i = 0; i < MAXVALUES; i++) {
			l.add((int)(Math.random() * i), (int) (Math.random() * 1000));
		}
		System.out.printf(
				"ArrayList: Random insert (at a random place) of %d elements took %d milliseconds.%n",MAXVALUES,
				System.currentTimeMillis() - time);

		
		time = System.currentTimeMillis();
		for (int i = 0; i < MAXVALUES; i++) {
			l.get((int) (Math.random() * MAXVALUES));
		}
		System.out.printf(
				"ArrayList: Random read (at a random place) of %d elements took %d milliseconds.%n",MAXVALUES,
				System.currentTimeMillis() - time);

		Iterator<Integer> iterator = l.iterator();
		time = System.currentTimeMillis();
//		for (int i = 0; i < MAXVALUES; i++) {
//			l.remove((int) (Math.random() * (MAXVALUES - i)));
//		}
		
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.printf(
				"ArrayList: Sequential delete took %d milliseconds.%n",
				System.currentTimeMillis() - time);

		// ------------------------------------------

		l = new LinkedList<Integer>();
		time = System.currentTimeMillis();
		for (int i = 0; i < MAXVALUES; i++) {
			l.add((int) (Math.random() * MAXVALUES));
		}
		System.out.printf(
				"LinkedList: Sequential insert of %d elements took %d milliseconds.%n",MAXVALUES,
				System.currentTimeMillis() - time);

		l = new LinkedList<Integer>();
		time = System.currentTimeMillis();
		for (int i = 0; i < MAXVALUES; i++) {
			l.add((int)(Math.random() * i), (int) (Math.random() * MAXVALUES));
		}
		System.out.printf(
				"LinkedList: Random insert (at a random place) of %d elements took %d milliseconds.%n",MAXVALUES,
				System.currentTimeMillis() - time);
		
		time = System.currentTimeMillis();
		for (int i = 0; i < MAXVALUES; i++) {
			l.get((int) (Math.random() * MAXVALUES));
		}
		System.out.printf(
				"LinkedList: Random read (at a random place) of %d elements took %d milliseconds.%n",MAXVALUES,
				System.currentTimeMillis() - time);

		
		iterator = l.iterator();
		time = System.currentTimeMillis();
//		for (int i = 0; i < MAXVALUES; i++) {
//			l.remove((int) (Math.random() * (MAXVALUES - i)));
//		}

		
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.printf(
				"LinkedList: Sequential delete took %d milliseconds.%n",
				System.currentTimeMillis() - time);
	}

}
