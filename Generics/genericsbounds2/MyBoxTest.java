package genericsbounds2;

/**
 * Test class for a generic Box which is using Java Generics
 */
public class MyBoxTest {

	public static void main(String[] args) {
		// Box<String> aStringBox = new Box<String>();
		Box<Student> aStudentBox = new Box<Student>();
		
		Student aStudent = new Student("Lisa"); 
		aStudentBox.largerAs(aStudent);
	
	}

}
