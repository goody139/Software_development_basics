package cast4;

public class PersStudTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println(s.name);
		
		// attributes are bound statically at compile time
		// note: dynamic binding only for visible methods
		System.out.println(((Person)s).name);
		
		// access to the attribute via the getter-method
		System.out.println(s.getName());
	}

}
