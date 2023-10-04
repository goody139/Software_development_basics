package genericsnotgeneric1;


/**
 * Using Object types instead of using Generics
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
