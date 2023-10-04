package comparing1;

public class Student extends Person {

	private int matNr;
	
	public Student() {
		this.setName("NA");
		matNr = 0;
	}
	
	public Student(String name, int matNr) {
		this.setName(name);
		this.matNr = matNr;
	}
	
	public void setMatNr(int matNr) {
		this.matNr = matNr;
	}
	
	public int getMatNr() {
		return matNr;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Student) {
            return matNr == ((Student)o).matNr && this.getName().equals(((Student)o).getName());
        }
		System.out.print(o + " is no Student! => ");
        return false;
	}
	
	public int hashCode() {
		return matNr + getName().hashCode();
	}
}
