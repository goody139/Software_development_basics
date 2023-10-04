package map3;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates the usage of map collection-views.
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("Element1", 4711);
		map.put("Element2",4712);
		map.put("Element3",4713);
		map.put("Element4",4714);
		map.put("Element5",4715);
	
		System.out.println("The map: " + map);
		// Returns a Set view of the keys contained in this map. 
		// The set is backed by the map, so changes to the map are reflected 
		//  in the set, and vice-versa.
		System.out.println("The key Set view of the map: " + map.keySet());
//		for(String s: map.keySet()) {
//			System.out.println(s);
//		}
		
		// Returns a Collection view of the values contained in this map. 
		// The collection is backed by the map, so changes to the map are reflected 
		//  in the collection, and vice-versa.
		System.out.println("The value Collection view of the map: " + map.values());
//		for(Integer i: map.values()) {
//			System.out.println(i);
//		}
		
		// Returns a Set view of the mappings contained in this map. 
		// The set is backed by the map, so changes to the map are reflected 
		//  in the set, and vice-versa. 
		System.out.println("The Set view of the mappings of the map: " + map.entrySet());
		for(Map.Entry<String,Integer> e: map.entrySet()) {
			System.out.println(e);
		}
		
	}

}
