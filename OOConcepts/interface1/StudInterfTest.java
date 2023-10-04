package interface1;

public class StudInterfTest {

	public static void main(String[] args) {

		Student s = new Student();
		Employable anotherStudent = new Student();
		
		System.out.println(s);
		System.out.println(anotherStudent);	
		
		// static constants can be accessed from the instance
		// but this often leads to confusion: 
		// static constants should be always accessed on class level
		// System.out.println(s.PI);
		
		System.out.println(Student.PI);
		System.out.println(Employable.PI);

	}
}
