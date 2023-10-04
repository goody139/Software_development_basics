package map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates the usage of a Map.
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Vogel", "Eine Tiergruppe (Klasse der Wirbeltiere)");
		map.put("Hamster","Daemmerungsaktive Nagetiere");
		map.put("Fisch","Im Wasser lebende Wirbeltiere mit Kiemen");
		map.put("Hund", "In der Zoologie die Familie der Canidae");
		
		System.out.printf("Map mit %d Elementen.%n",map.size());
		System.out.println(map);
		
		System.out.printf("Key Hund wurde entfernt und hatte den Value <%s>%n",map.remove("Hund"));
		System.out.printf("Key Hund wurde entfernt und hatte den Value <%s>%n",map.remove("Hund"));
		
		System.out.println(map);
		
		System.out.printf("Der Key Vogel wurde ueberschrieben. Vorher war der Wert <%s> enthalten%n", map.put("Vogel", "Juergen (*1968) Deutscher Schauspieler"));
		System.out.println(map);
		
		System.out.printf("Wert zum Key Vogel=<%s>%n",map.get("Vogel"));
		
		System.out.printf("Der Key <Drachen> ist%s enthalten%n", map.containsKey("Drachen")?"":" nicht");
		System.out.printf("Der Key <Fisch> ist%s enthalten%n", map.containsKey("Fisch")?"":" nicht");
		
		
	}

}
