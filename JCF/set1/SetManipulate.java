package set1;

import java.util.HashSet;
import java.util.Set;

public class SetManipulate {

	public static void main(String[] args) {

		Set<MyStore>s = new HashSet<MyStore>();

		// object we want to store in the HashSet s
		MyStore ms1 = new MyStore();
		MyStore ms2 = new MyStore();
		MyStore ms3 = new MyStore();

		// change the value
		ms1.setValue(10);
		ms2.setValue(10);

		// insert objects into our set
		s.add(ms1);
		s.add(ms2); 
		
		// no insertion if it is already contained! (decision is based on equals()!)
		if (!s.add(ms3)) {
			System.err.printf("%s could not be inserted.%n", ms3);
		}

		// is element contained in the set?
		if (s.contains(ms1)) {
			System.err.printf("%s is contained with value %d.%n", ms1, ms1.getValue());
		}

		if (s.contains(ms3)) {
			System.err.printf("%s is contained with value %d.%n", ms3, ms3.getValue());
		}		
		
		// change object data (after having it inserted into our HashSet
		ms1.setValue(1);

		// is element still contained?  (hash value is calculated with the int value...)
		if (s.contains(ms1)) {
			System.err.printf("%s is still contained with value %d.%n", ms1, ms1.getValue());
		}

		System.out.printf("Number of elements contained: %d %n", s.size());
	}
}
