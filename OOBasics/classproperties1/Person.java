package classproperties1;

public class Person {
	  static int objNo = 0; // instance counter
	  public static final int NUMBEROFEARS = 2; // class constant
	  
	  int age;
	  String name;

	  Person() {
	    this.name = "dummy";   
	    this.age = 0;
	    ++objNo;
	  }
	  
	  // instance method accessing a class variable
	  // (could be done in a destructor)
	  protected void dying() {
	    --objNo;
	  }
	  
	  // an instance getter method
	  public int getAge() {
		  return age;
	  }
	  
	  // a class method for demonstration purposes
	  public static void classMethodHelper() {
		  // do sth
	  }
	  
	  // a class method cannot access instance properties
	  public static int classMethod() {
//		  this.getAge(); // "this" is not working
//		  getAge(); // call to an instance method is not working
//		  this.age; // "this" is not working
		  classMethodHelper(); // call to a class method works
		  return NUMBEROFEARS; // access to a class variable works
	  }

	  // an instance method can access class properties and
	  // shares these with all other instances
      public void instanceMethod() {
    	  this.getAge(); // call to instance method is working
    	  System.out.println("Instance access to class method retrieving the number of ears: " + classMethod());
      }
}
