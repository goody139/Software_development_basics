package generics2;

/**
 * Test class for a generic Box which is using Java Generics
 */
public class MyBoxTest {

	public static void main(String[] args) {
		Box<String,String> aStringBox = new Box<String,String>();
		Box<Student,Student> aStudentBox = new Box<Student,Student>();
		Box<String,Student> aMixedBox = new Box<String,Student>();

		// instanceof is not working due to type erasure in Java
		// boolean b =  aStringBox instanceof Box<String,String>;  
		
		
		// compiler notices the incorrect typing
		// aStringBox.add(new Student("Lisa Simpson"), new Student("Fritz Fischer"), new Object());

		
		// proper usage:
		aStringBox.add("Hallo1","Hallo2",new Student("Fritz Fischer"));
		System.out.println("Box contents: " + aStringBox.getElement1() + ", " + 
				aStringBox.getElement2() + ", " +  
				aStringBox.getElement3());
		
		// type checking based on Generics: compiler notices the type error
		// Student aStudent1 = (Student) aStringBox.getElement2();
		
		// we can still use raw types (without parameter type), all based on Object
		// possible for compatibility reasons (generics have been introduced in Java 1.5)
		Box aRawBox = new Box<String,String>();
		Box aSecondRawBox = new Box();
	
		// if so, we have the well-known typing problem (no type safety anymore)
		aSecondRawBox.add("Hallo1","Hallo2",new Student("Fritz Fischer"));
		Student aStudent2 = (Student) aSecondRawBox.getElement2();

	}

}
