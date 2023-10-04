package comparing1;

public class PersStudTest {

	public static void main(String[] args) {

		Student s1 = new Student("Fritz Fischer", 4711);
		Student s2 = new Student("Fritz Fischer", 4711);

		System.out.println("s1 == s2: " + (s1 == s2) );
		System.out.println("s1.equals(s2): " + s1.equals(s2) );

		Person p = new Person("Fritz Fischer");

		System.out.println("p == s1: " + (p == s1) );
		System.out.println("s1.equals(p): " + s1.equals(p) );
		System.out.println("p.equals(s1): " + p.equals(s1) );
	}
	
}
