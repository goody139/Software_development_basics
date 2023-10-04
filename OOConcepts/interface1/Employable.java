package interface1;

/**
 * interface: all objects implementing this interface
 * are able to work (fulfill the Employable interface)
 * the interface defines all what should be visible to clients
 * of those objects implementing the interface
 */
public interface Employable {
	
	// final static double PI = 3.14d; // ok: constant on class level
	final double PI = 3.14d; // ok: implicit static (therefore same as final static double ...)
	
	public String getWork();
	
	public abstract void setWork(String w);
}
