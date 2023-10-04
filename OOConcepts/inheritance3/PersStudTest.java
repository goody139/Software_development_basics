package inheritance3;

public class PersStudTest {
	public static void main(String[] args) {
		Student s = new Student("Fritz Fischer",4711);
		
		// Student inherits methods from Person
		System.out.println("Matr.No.: " + s.getMatNr());
		System.out.println("Name: " + s.getName());
	}
}
