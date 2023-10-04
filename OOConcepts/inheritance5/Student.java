package inheritance5;

public class Student extends Person {
	public int matNr;

	public Student() {
		name = "NA";	// name is declared public in superclass
		matNr = 0;
		// better alternative here: this("NA",0);
	}
	
	public Student(String name, int matNr) {
		super(name); // super() must be first statement
		             // without super(...) the compiler automatically inserts super();
		// this(); // a call of this() is not possible when super() has to be called
		           // we circumvent this problem by means of a private initialization method
		// this.name = name;
		this.matNr = matNr;
	}
}
