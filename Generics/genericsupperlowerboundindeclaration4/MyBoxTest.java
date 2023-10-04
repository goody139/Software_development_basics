package genericsupperlowerboundindeclaration4;

/**
 * Test class for a generic Box using Generics 
 * Using Wildcards and Bounds (Upper Bound, Lower Bound) in the declaration
 * (besides bounds in the definition, i.e. in the implementation, 
 *  there are bounds in the declaration too as can be seen in this code)
 */
public class MyBoxTest {

	public static void main(String[] args) {

		Box<Student> aStudentBox = new Box<Student>();
		aStudentBox.add(new Student("Fritz Fischer"));
		System.out.println("Box contents: " + aStudentBox.getElement1());	
		
		// Wildcard (keep the type open)
		Box<?> secondBox;
		secondBox = new Box<String>();
		secondBox = aStudentBox;
		
		// ... results in problems: compiler cannot determine the type for the add operation
		// secondBox.add(new Student("Lisa Simpson"));
		
		// ------------------------------------------------------
		// Upper Bounds in the declaration: 
		//   actual parameter may be the type Person or all subtypes of Person
		Box<? extends Person> thirdBox;

		// working: Student extends Person
		Box<Student> aStudentBox2 = new Box<Student>();
		thirdBox = aStudentBox2;
		
		// compiler error: String does not extend Person
		Box<String> aStringBox  = new Box<String>();
		// thirdBox = aStringBox;		
		
		// ------------------------------------------------------
		// Lower Bounds in the declaration: 
		//   actual parameter may be the type Person or all supertypes of Person
		Box<? super Person> fourthBox;

		// working with type Person and with its supertype Object
		Box<Person> aPersonBox = new Box<Person>();
		fourthBox = aPersonBox;
		Box<Object> anObjectBox = new Box<Object>();
		fourthBox = anObjectBox;		
		
		// compiler error: not working with types that are no supertypes
		Box<String> myStringBox = new Box<String>();
		// fourthBox = myStringBox;
		Box<Student> myStudentBox = new Box<Student>();
		// fourthBox = myStudentBox;				
	}

}
