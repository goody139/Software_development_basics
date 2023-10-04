package autoboxing2;

/**
 * Problems for autoboxing due to reuse of Integer instances in the range [-128;127].
 */
public class BoxingTest {

    public static void main(String[] args) {
    	   	
        // beyond range [-128;127], no autoboxing
        System.out.println("new Integer(4711) == new Integer(4711):\t" + (new Integer(4711) == new Integer(4711)));
               
        // beyond range [-128;127], autoboxing: boxing of 4711 in two cases
        Integer i = 4711; Integer j = 4711;
        System.out.println("Integer i=4711; Integer j=4711; i==j:\t" + (i==j));

        // within range [-128;127], no autoboxing
        System.out.println("new Integer(42) == new Integer(42):\t" + (new Integer(42) == new Integer(42)));
              
        // within range [-128;127], autoboxing: boxing of 42 in two cases
        Integer k = 42; Integer l = 42;
        System.out.println("Integer k = 42; Integer l = 42; k==l:\t" + (k==l));

        // within range [-128;127], autoboxing for first: boxing of 42, no autoboxing for second
        Integer m = 42;
        System.out.println("Integer m = 42; m == new Integer(42):\t" + (m == new Integer(42)));

    }

}
