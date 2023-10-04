package genericmethod1;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		String s1 = MyUtil.<String>random("Essen","Schlafen");
		String s2 = MyUtil.random("Essen","Schlafen");
		// String s3 = MyUtil.random(1,"Schlafen");
		
		Crayon red = new Crayon();
		List<Box<Crayon>> crayonBoxes = new MyList<Box<Crayon>>();
		Box.<Crayon>fillBoxes(red,crayonBoxes);
		
		
	}

}
