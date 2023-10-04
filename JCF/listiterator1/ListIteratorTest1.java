package listiterator1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Demonstrates the usage of the ListIterators.
 * 
 */
public class ListIteratorTest1 {

	private static BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		boolean stop = false;
		int tmp;

		// simple foreach iterator (no explicit iterator construction necessary)
		for (String s : "1 2 3 4 5 6 7 8 9 0".split(" "))
			l.add(Integer.parseInt(s));

		// get the iterator from the list
		ListIterator<Integer> iterator = l.listIterator();

		while (!stop) {
			switch (readChoice()) {
			case 1:
				if(iterator.hasNext()) {
					tmp = iterator.next();
				    System.out.println("Iterator reads element with value " + tmp + " at position: " + iterator.previousIndex());
				}
				else
					System.out.println("We are already at the end of the list!");
				break;
			case 2:
				if (iterator.hasPrevious()) {
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
				} catch (IOException e) {
					System.err.println("Could not read from stdin - end of program!");
					System.exit(1);
				} catch (NumberFormatException e1) {
					System.err.println("Input is not a number");
				}
				break;
			case 4:
				iterator.remove();
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
