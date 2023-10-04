package inheritance4;

public class Student extends Person {
	public int matNr;

	public Student() {
		this("NA",0);
	}
	
	public Student(String name, int matNr) {
		super(name); // call constructor of superclass
		this.setMatNr(matNr);
	}
	
	public void setMatNr(int matNr) {
		this.matNr = matNr;
	}
	
	public int getMatNr() {
		return matNr;
	}
	
	// overriding by extending the method of the superclass 
	// (reusing implementation of superclass by call to super)
	public String getName() { // method overriding
		return "Student Name: " + super.getName();
	}
	
	// overriding by just referring to the method in super class
	public String personName() {
		return super.getName();
	}
}
