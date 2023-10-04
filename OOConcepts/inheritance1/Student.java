package inheritance1;

public class Student extends Person {
	public int matNr;

	public Student() {
		name = "NA Student";	
		matNr = 0;
		// better alternative here: this("NA",0);
	}
	
	public Student(String name, int matNr) {
		this.name = name;
		this.matNr = matNr;
	}
}
