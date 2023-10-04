package listiterator1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Demonstrates the usage of the ListIterators.
 * Refined remove operation.
 * 
 */
public class ListIteratorTest2 {

	private static BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
	

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		boolean stop = false;
		int tmp;

		//important for remove()
		boolean added = true;
		
		// simple foreach iterator (no explicit iterator construction necessary)
		for (String s : "1 2 3 4 5 6 7 8 9 0".split(" "))
			l.add(Integer.parseInt(s));

		// get the iterator from the list
		ListIterator<Integer> iterator = l.listIterator();

		while (!stop) {
			switch (readChoice()) {
			case 1:
				if(iterator.hasNext()) {
					added = false;
					tmp = iterator.next();
				    System.out.println("Iterator reads element with value " + tmp + " at position: " + iterator.previousIndex());
				}
				else
					System.out.println("We are already at the end of the list!");
				break;
			case 2:
				if (iterator.hasPrevious()) {
					added = false;
					tmp = iterator.previous();
			        System.out.println("Iterator reads element with value " + tmp + " at position: " + iterator.nextIndex());
				}
				else
					System.out.println("We are already at the beginning of the list!");
				break;
			case 3:
				System.out.print("Insert a number: ");
				String s;
				try {
					s = reader.readLine();
					iterator.add(Integer.parseInt(s));
					added = true;
				} catch (IOException e) {
					System.err.println("Could not read from stdin - end of program!");
					System.exit(1);
				} catch (NumberFormatException e1) {
					System.err.println("Input is not a number");
				}
				break;
			case 4:
				/*
				 * iterator.remove() just works once per call of next() or previous().
				 * Therefore, remove() does not work directly at the beginning, because next()/previous() has not yet been called.
				 * Furthermore, remove() does not work if an element has been added with add(E) after calling next()/previous().
				 */
				if(added){
					System.out.println("iterator.remove() just works once per call of next() or previous().\n"
										+ "Therefore, remove() does not work directly at the beginning, because next()/previous() has not yet been called.\n"
										+ "Furthermore, remove() does not work if an element has been added with add(E) after calling next()/previous().\n"
										+ "Please make another decision");
				} else {
					// no problems, just do it. But make sure that no 2nd remove is possible
					iterator.remove();
					added = true;
				}
				break;
			case 5:
				System.out.println(l);
				break;
			case 9:
				System.out.println("End of program");
				stop = true;
				break;
			default:
				System.out.println("Wrong input!");

			}
		}

	}

	// helper method for the menue
	private static int readChoice() {
		String s = null;

		while (true) {
			System.out.println("Your choice:");
			System.out.println("  1) go to right");
			System.out.println("  2) go to left");
			System.out.println("  3) insert element");
			System.out.println("  4) delete element");
			System.out.println("  5) print list");
			System.out.println("  9) end of program");
			try {
				s = reader.readLine();
			} catch (IOException e) {
				System.err.println("Could not read from stdin.");
				System.exit(1);
			}

			try {
				return Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.err.println("Not a number, insert again ...");
			}
		}
	}

}
