package inheritance4;

public class PersStudTest {
	public static void main(String[] args) {
		Student s = new Student("Fritz Fischer",4711);
		System.out.println("Matr.No.: " + s.getMatNr());

		// call of the overridden method
		System.out.println("Name: " + s.getName());

		// print name: dynamic binding for public methods
		System.out.println("Name: " + ((Person)s).getName());

		// print name: method in student (which calls method of superclass)
		System.out.println("Name: " + s.personName());
		
	}
}
