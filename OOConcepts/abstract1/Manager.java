package abstract1;

/**
 * Class Manager inherits from abstract class Person
 * has to implement all abstract elements of the superclasses
 */
public class Manager extends Person {

	private int salary;

	// custom constructor calls the super constructor
	public Manager(String name, int s) {
		super(name);
		this.salary = s;
	}
	
    // implements the abstract method of the superclass as required
	public String getProfession() {
		return "Earning "+ this.salary + "per year";
	}

}
