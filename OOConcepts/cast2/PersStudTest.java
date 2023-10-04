package cast2;

public class PersStudTest {

	public static void main(String[] args) {

		Student s = new Student("Fritz Fischer",4711);
		
		System.out.println(s); // uses the overridden method toString()
		                       // equal: System.out.println(s.toString());

		// Dynamic Binding!
		// calling toString from Student
		System.out.println(((Person)s).toString());
		
		// At runtime a student instance is in s.
		// The following is not working besides dynamic binding (static type check)
		// System.out.println(((Person)s).getMatNr());		
		
	}
}
