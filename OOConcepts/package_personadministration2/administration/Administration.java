package package_personadministration2.administration;

import package_personadministration2.persons.Student;
import java.util.*; // contains Date
// import java.sql.*; // contains Date

/**
 * class to demonstrate the usage of import
 */
public class Administration {
	public static void main(String args[]) {
		// import makes the fully qualified name unneccessary
		Student s = new Student("Fritz Fischer",4711);
		
		// if getName() would be declared protected the following would not work:
		System.out.println(s.getName());
		
		// ambiguous for some imports
		System.out.println(new Date());
	}
}
