package package_personadministration1.administration;

/**
 * class demonstrating the usage of fully qualified names.
 */
public class Administration {
	public static void main(String args[]) {
		package_personadministration1.persons.Student s = new package_personadministration1.persons.Student("Fritz Fischer",4711);
		System.out.println(s.getName());
	}
}
