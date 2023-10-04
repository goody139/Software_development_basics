package cast1;

public class PersStudTest {

	public static void main(String[] args) {

		Person p = new Student("Fritz Fischer",4711);
		Person realperson = new Person("anonymous");
		
		System.out.println(p);
		
		// not working (compiler knows that Person has no setMatNr())
		// the compiler does not know what is really referenced 
		// (this information is only available at runtime)
		// p.setMatNr(42);

		// a student confirming to be a student:
		((Student)p).setMatNr(42);
		System.out.println(p);
		
		// a person pretending to be a student: (exception)
		System.out.println(realperson.getName());
		((Student)realperson).setName("tricky");
	}
}
