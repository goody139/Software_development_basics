package abstract1;

/**
 * Class Student inherits from abstract class Person
 * and has to implement all abstract elements of the superclasses
 */
public class Student extends Person {

	private int matNr;
	
	// custom constructor calls the super constructor (of abstract class Person)
	public Student(String name, int matNr) {
		super(name);
		this.matNr = matNr;
	}

    // implements the abstract method of the superclass
	public String getProfession() {
	  // return (int)4; // return type int is not possible due to the definition in Person 
	  return "Studying (Matr.No.: " + matNr + ")";
	}

}
