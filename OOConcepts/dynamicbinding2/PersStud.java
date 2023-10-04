package dynamicbinding2;

public class PersStud {
	public static void main(String[] args) {
		Student s = new Student();

		System.out.println("Name of Student s: " + s.name);

		System.out.println("Name of Student s: " + s.getName());
	}	
}
