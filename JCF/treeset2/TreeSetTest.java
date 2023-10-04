package treeset2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet compares with compareTo() and not with equals().
 */
public class TreeSetTest {

	public static void main(String[] args) {
		Set<Point> set = new TreeSet<Point>();
		
		Point p1 = new Point(1,100);
		Point p2 = new Point(100,1);
		
		System.out.printf("p1.hashCode(): %d  p2.hashCode(): %d%n",p1.hashCode(),p2.hashCode());
		System.out.printf("p1.equals(p2): %s%n",p1.equals(p2));
		System.out.printf("p1.compareTo(p2): %d%n",p1.compareTo(p2));
		
		// inserting into TreeSet (uses compareTo())
		if(set.add(p1)) {
			System.out.println("p1 has been inserted in TreeSet");
		} else {
			System.out.println("p1 not inserted");
		}
		
		if(set.add(p2)) {
			System.out.println("p2 has been inserted in TreeSet");
		} else {
			System.out.println("p2 not inserted");
			if (set.contains(p2)) {
				System.out.println("  reason: already contained");
			}
		}
		
		
		// now the same with HashSet (equals-method is used instead)
		Set<Point> set2 = new HashSet<Point>();
		
		if(set2.add(p1)) {
			System.out.println("p1 has been inserted in HashSet");
		} else {
			System.out.println("p1 not inserted");
		}
		
		if(set2.add(p2)) {
			System.out.println("p2 has been inserted in HashSet");
		} else {
			System.out.println("p2 not inserted");
		}
	}

}
