package cast1;

public class Student extends Person {
	
	private int matNr;
	
	public Student() {
		this("NA", 0);
	}
	
	public Student(String name, int matNr) {
		super(name);	// explicit call to constructor of the superclass
		setMatNr(matNr);
	}
	
	public void setMatNr(int matNr) {
		this.matNr = matNr;
	}
	
	public int getMatNr() {
		return matNr;
	}

	public String toString() { // overriding
		return "Student with Name: " + super.getName() + " Matr.No. ="+ matNr;
	}
}
