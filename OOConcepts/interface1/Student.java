package interface1;

/**
 * Student implements interface Employable
 */
public class Student implements Employable {

	private String work;
	
	@Override public String getWork() {
		return work;
	}

	@Override public void setWork(String w) {
		this.work = w;
	}

}
