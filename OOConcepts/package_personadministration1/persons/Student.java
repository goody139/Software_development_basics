package package_personadministration1.persons;

/**
 * Simple class Student for package test
 */
public class Student extends Person {
	private int matNr;
	
	public Student(String name, int matNr) {
		super(name);
		this.matNr = matNr;
	}
	
	public void setMatNr(int matNr) {
		this.matNr = matNr;
	}
	
	public int getMatNr() {
		return matNr;
	}
}
