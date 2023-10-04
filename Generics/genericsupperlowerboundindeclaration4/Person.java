package genericsupperlowerboundindeclaration4;

/**
 * Superclass for Student for demonstration purposes
 */
public class Person {

	private String name;
	
	public Person(String n) {
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
