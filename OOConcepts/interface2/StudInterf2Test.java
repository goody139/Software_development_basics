package interface2;

public class StudInterf2Test {

	public static void main(String[] args) {
		Person somePerson = new Student("Fritz Fischer",4711);
		
		// declaring the type by means of the interface 
		// this way we express: "we want to have
		// a variable of a certain role fulfilling a certain contract)"
		// the concrete instance type is not relevant as long as the interface is kept
		// -> roles of instances
		HumanNature someOtherPerson = new Student("Lisa Simpson",4712);
		Employable yetAnotherPerson = new Student("Willi Wacker",4713);
		
		// the following is not working (you cannot make an instance from an interface):
		// Employable = new Employable();
		
		System.out.println(somePerson);
		System.out.println(someOtherPerson);
		System.out.println(yetAnotherPerson);
			
		System.out.println("Max. Workload of a human being is: " + HumanNature.MAXWORKLOAD);
		
		// type testing / interface marking
		System.out.println("Instance somePerson is marked with the interface HumanNature: " + (somePerson instanceof HumanNature));
		System.out.println("Instance someOtherPerson is marked with the interface HumanNature: " + (someOtherPerson instanceof HumanNature));
		System.out.println("Instance yetAnotherPerson is marked with the interface HumanNature: " + (yetAnotherPerson instanceof HumanNature));
		System.out.println("Instance somePerson is marked with the Person: " + (somePerson instanceof Person));
		
		// constant conflicts in case of multiple implementation: resolved by type
		// (remark: static constants should not be accessed via an instance!)
		// System.out.println("CONFLICTVAR of Student: " + yetAnotherPerson.CONFLICTVAR);

		// LawCompatible yetAFourthPerson = new Student("Maggie Simpson",4714);
		// System.out.println("CONFLICTVAR of Student: " + yetAFourthPerson.CONFLICTVAR);

		// If the interface is not given the compiler detects the ambiguity:
		// System.out.println("CONFLICTVAR of Student: " + Student.CONFLICTVAR);
	}

}
