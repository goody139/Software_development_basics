package inheritance5;

public class PersStudTest {
	public static void main(String[] args) {
		
		// Observing the call of the super constructor
		Student s = new Student("Fritz Fischer",4711);
		
		System.out.println("Matr.No.: " + s.matNr);
		System.out.println("Name: " + s.name);
	}
}
