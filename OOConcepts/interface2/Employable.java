package interface2;

/**
 * interface: all objects implementing this interface
 * are able to work (fulfill the Employable interface)
 * the interface defines all what should be visible to clients
 * of those objects implementing the interface
 * Employable inherits (all the special human conditions) from interface HumanNature 
 */
public interface Employable extends HumanNature {
	
	// final static double PI = 3.14d; // ok: constant on class level
	final double PI = 3.14d; // ok: implicit static (therefore same as final static double ...)
	
	// next two to test conflicts in case of multiple implementation of interfaces
//     final static int CONFLICTVAR = 2;   
//     public String conflictingmethod(int a);
	
    
	public String getWork();
	
	public void setWork(String w);
}
