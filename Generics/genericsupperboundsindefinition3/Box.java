package genericsupperboundsindefinition3;

import java.io.Serializable;


/**
 * Using Generics
 * Using a Bound (Upper Bound) in the parameter type
 */
public class Box <T1,T2 extends Serializable> {

	private T1 element1;
	private T2 element2;
	private Object element3;
	
	private String boxName;
	
	public Box() {
		this.setName("NA");
	}
	
	public Box(String n) {
		this.setName(n);
	}
	
	public String getName() {
		return this.boxName;
	}
	
	public void setName(String n) {
		this.boxName = n;
	}
	
	public String toString() {
		return this.getName();
	}
	
	
	public void add(T1 o1, T2 o2, Object o3) {
       this.element1 = o1; this.element2 = o2; this.element3 = o3;
	}
	
	public T1 getElement1() {
		return element1;
	}
	
	public T2 getElement2() {
		return element2;
	}
	
	public Object getElement3() {
		return element3;
	}
}
