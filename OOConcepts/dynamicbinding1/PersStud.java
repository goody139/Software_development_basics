package dynamicbinding1;

public class PersStud {
	public static void main(String[] args) {
		Student s = new Student("Fritz Fischer",4711);
		Person p = new Person("Willi Wacker");

		System.out.println("Student s: " + s.toString());

		System.out.println("Person p: " + p.toString());

		p = s;
		System.out.print("We have a reference to Person which points to a Student:\n");
		System.out.println(p.toString());

	}
}
