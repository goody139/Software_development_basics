package genericmethod1;

import java.util.List;



public class Box<T> {
	
	public static <U> void fillBoxes(U u, List<Box<U>> boxes) {
		  for (Box<U> box : boxes) {
		      box.add(u);
		  }
	}
	public void add(T element) {
		// add sth into the box
	}

}
