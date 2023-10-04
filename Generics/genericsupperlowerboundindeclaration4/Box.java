package genericsupperlowerboundindeclaration4;


/**
 * Using Generics
 */
public class Box <E> {

	private E element1;
	
	
	public void add(E e) {
       this.element1 = e;
	}
	
	public E getElement1() {
		return element1;
	}
	
}
