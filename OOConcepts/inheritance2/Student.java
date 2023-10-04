package inheritance2;

public class Student extends Person {
	public int matNr;
	public String name; // shadowing attribute of the superclass

	public Student() {
		this("NA",0);
	}
	
	public Student(String name, int matNr) {
		this.name = name; // attribute of class Student
		super.name = "Class Person"; // attribute of class Person
		this.matNr = matNr;
	}
	
	public String getSuperName() {
		// return super.super.name; // does not work
		return super.name;
	}	
}
