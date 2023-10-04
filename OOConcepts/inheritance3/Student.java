package inheritance3;

public class Student extends Person {
	public int matNr;

	public Student() {
		this("NA",0);
	}
	
	public Student(String name, int matNr) {
		this.setName(name); // replacing: this.name = name;
		this.setMatNr(matNr);
	}
	
	public void setMatNr(int matNr) {
		this.matNr = matNr;
	}
	
	public int getMatNr() {
		return matNr;
	}
}
