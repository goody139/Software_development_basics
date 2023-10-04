package interface2;

/**
 * Student implements interface Employable and LawCompatible
 */
public class Student extends Person implements Employable, LawCompatible {

	private String work;
	private int matNr;
	
	public Student(String name, int matNr) {
		super(name);
		this.matNr = matNr;
	}
	
	public String getWork() {
		return work;
	}

	public void setWork(String w) {
		this.work = w;
	}

	public String getProfession() {
		return "Studying";
	}
	
	public String makeBreak(int b) {
		// make a break for b minutes
	    return "recovered";	
	}
}
