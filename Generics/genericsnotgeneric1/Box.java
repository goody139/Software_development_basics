package genericsnotgeneric1;


/**
 * Using Object types instead of using Generics
 */
public class Box  {

	private Object obj1;
	private Object obj2;
	private Object obj3;
	
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
	
	
	public void add(Object o1, Object o2, Object o3) {
       this.obj1 = o1; this.obj2 = o2; this.obj3 = o3;
	}
	
	public Object getObject1() {
		return obj1;
	}
	
	public Object getObject2() {
		return obj2;
	}
	
	public Object getObject3() {
		return obj3;
	}
}
