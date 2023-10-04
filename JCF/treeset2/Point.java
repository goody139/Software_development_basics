package treeset2;

/**
 * Point class
 * Note: this class has a natural ordering that is inconsistent with equals.
 * This means: !((x.compareTo(y)==0) == (x.equals(y)))
 * Such an implementation is not recommended!!!
 */
public class Point implements Comparable<Point> {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y = y;
	}
	
	public int compareTo(Point p) {
		return (int)(Math.sqrt(this.x * this.x + this.y * this.y) - Math.sqrt(p.x * p.x + p.y * p.y));
	}
	
	public boolean equals(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
	public int hashCode() {
		return x * x + y * y;
	}

}
