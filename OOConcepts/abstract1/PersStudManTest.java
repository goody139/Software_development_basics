package abstract1;

public class PersStudManTest {

	public static void main(String[] args) {

		// Person p = new Person("Fritz Fischer");
		Person somePerson = new Student("Fritz Fischer",4711);
		Manager aManager = new Manager("Lisa Simpson",100000);
		
		// implicitly calls toString() of Object and thus, prints class name + object hash code
		System.out.println(somePerson);
		System.out.println(aManager);
		
		// trying to get access to a Person by means of static binding:
		//  name must be public or protected to get the following to compile
		// System.out.println("Name of Person: " + somePerson.name);
		// System.out.println("Name of Person: " + ((Person)somePerson).name);
	}
}
