package inheritance2;

public class PersStudTest {
	public static void main(String[] args) {
		Student s = new Student("Fritz Fischer",4711);
		
		System.out.println("Matr.No.: " + s.matNr);

		System.out.println("Name: " + s.name);

		System.out.println("Super Name: " + s.getSuperName());
		
		// Accessing attribute of the superclass 
		// by means of type cast
		// (Dynamic binding only for visible instance methods)
		System.out.println("Name (cast): " + ((Person)s).name);	
	}
}
