package map2;

/**
 * Class Point.
 */
public class Point implements Comparable<Point> {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int compareTo(Point p) {
		return (int) (Math.sqrt(this.x * this.x + this.y * this.y) - Math
				.sqrt(p.x * p.x + p.y * p.y));
	}

	public boolean equals(Point p) {
		return this.x == p.x && this.y == p.y;
	}

	public int hashCode() {
		return x * x + y * y;
	}

	public String toString() {
		return "Point (" + x + "," + y + ")";
	}

}
