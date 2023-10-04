package classproperties1;

public class Person1 {
	  // this assignment is done before the static block
	  static int i;
	  static int j = Person1.classMethod();
	  
	  // Class initializer (static constructor)
	  static {
		  // this block initializes
		  // it is useful in cases where the
		  // initialization is more complex
		  i = 5;
		  j = 3 + i;
	  }
	  public static int classMethod() {
          return 6;
	  } 
}
