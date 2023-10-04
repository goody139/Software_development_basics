package dynamicbinding2;

public class Student extends Person {
	public String name;
	
	public Student() {
		name = "Student Name";
	}
	
	public String toString() {
		return "Student with Name: " + super.getName();
	}
}
