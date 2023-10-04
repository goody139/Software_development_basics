package genericsupperboundsindefinition3;

import java.io.Serializable;


/**
 * Students to be filled in the Box
 * has to implement Serializable if we want to put it in the Box (due to Bound)
 */
public class Student implements Serializable {

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
