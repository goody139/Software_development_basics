package genericsbounds2;

import java.io.Serializable;


/**
 * Using Generics
 */
public class Box <T extends Comparable<T> & Test> {
// public class Box <T> {

	private T element;
	
	public void add(T e) {
	    this.element = e; 
	 }

	 public T getElement() {
	   return element;
	 }

	 public boolean largerAs(T val) {
	    // if (val > this.getElement()) return true
	    if (val.compareTo(this.getElement()) > 0) return true;
	    else return false;
	 }
} 

	

