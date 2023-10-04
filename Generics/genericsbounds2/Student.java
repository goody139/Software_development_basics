package genericsbounds2;

/**
 * Students to be filled in the Box
 */
public class Student implements Comparable<Student>, Test {
// public class Student {
	private String name;
	
	public int compareTo(Student o) {
		// todo: some kind of comparison
		return 1;
	}
	
	public Student(String n) {
		this.setName(n);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String toString() {
		return this.getName();
	}
	
}
