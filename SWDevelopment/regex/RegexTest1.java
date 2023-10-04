package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Einige Tests mit regulaeren Ausdruecken in Java
public class RegexTest1 {

	public static void main(String[] args) {

		String s1 = new String("Hallo Welt");
		boolean b;
		
		// Passt unsere Zeichenkette s1 zum regulaeren Ausdruck "Hallo Welt"?

		// Musterpruefung Variante 1 (direkt ueber String)
		b=s1.matches("Hallo Welt");
		b="Hallo Welt".matches("Hallo Welt");	
		
		// Musterpruefung Variante 2 (Pattern-Klasse)
		b=Pattern.matches("H.*t","Hallo Welt");
	
		// Musterpruefung Variante 3 (Matcher-Klasse)
		Pattern p = Pattern.compile("H.*t"); // Pattern anlegen
		Matcher m = p.matcher(s1); // Zuordnung
		b=m.matches();
					
		// Beispiele fuer weitere regulaere Ausdruecke
		String s2 = "ABC.";
		b=s2.matches("[a-zA-Z]{0,4}.*"); // Zeichenbereich und Quantifizierer
		b=s2.matches("[aA][bB][cC].*"); // Zeichenbereich
		b=s2.matches("^A.*");  // vordefinierte Positionen
		b=s2.matches(".*\\."); // Sonderzeichen
	
		// Ausgabe des Pruefergebnisses
		System.out.println(b);
		
		// Noch mehr regulaere Ausdruecke
		System.out.println("ABC".matches("[a-zA-Z]{0,3}"));
        System.out.println("ababababa".matches("(aba){2,4}.*"));
        System.out.println("Nein".matches("[Jj]a|[Nn]ein"));
        System.out.println("Nein.*".matches("Nein\\.\\*"));
        System.out.println("Hallo Welt".matches("[a-zA-Z]*\\s[a-zA-Z]*"));
        			
		// Regular Expression fuer das Ersetzen von Zeichen im String
		System.out.println("Hallo Welt".replace("Welt","InfoB"));
	}
}
