package generics2;

/**
 * Students to be filled in the Box
 */
public class Student  {

	private String name;
	
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
