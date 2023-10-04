package map2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Demonstrates the usage of a Map (HashMap, TreeMap).
 */
public class MapTest {

	public static void main(String[] args) {
		Map<Point,String> map = new HashMap<Point,String>();
		
		Point p1 = new Point(1,100);
		
		map.put(p1, "P1(1,100)");
		System.out.printf("The map does%s contain %s%n",map.containsKey(p1)?"":" not", p1);
		System.out.printf("%s%n%n",map);
		
		p1.setX(100); // a problematic change!!! (element stays in the map but cannot be found in it anymore)
		System.out.printf("The map does%s contain %s%n",map.containsKey(p1)?"":" not", p1);
		System.out.printf("%s%n%n",map);
		
		Point p2 = new Point(1,100);
		System.out.printf("The map does%s contain %s%n",map.containsKey(p2)?"":" not", p2);
		System.out.printf("%s%n%n",map);
		
		
		p1 = new Point(1,100);
		p2 = new Point(100,1);
		
		map = new TreeMap<Point,String>();
		
		System.out.printf("Previous value for key p1 was %s%n", map.put(p1, "P1(1,100)"));
		System.out.printf("%s%n%n",map);
		System.out.printf("Previous value for key p2 was %s%n", map.put(p2, "P2(100,1)"));
		System.out.printf("%s%n%n",map);
	}

}
