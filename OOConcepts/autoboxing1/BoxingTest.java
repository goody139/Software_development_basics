package autoboxing1;

/**
 * Problems of autoboxing in loops
 */
public class BoxingTest {

    public static void main(String[] args) {
        final int MAXVALUE = 10000000;
        
        long time1, time2;
        
        // with stupid autoboxing:
        time1 = System.currentTimeMillis();
        for(Integer i = 0; i<MAXVALUE; i++) {
            // some statements
        }
 
        time2 = System.currentTimeMillis();
        System.out.println("Duration with int-Integer autoboxing [milliseconds]: " + (time2-time1));
        
        
        // with manual "autoboxing" (what the above is transformed to by the compiler):
        time1 = System.currentTimeMillis();
       	for(Integer i = Integer.valueOf(0); i.intValue()<MAXVALUE; i=Integer.valueOf(i.intValue()+1)) { 
       		// some statements
       	}
        time2 = System.currentTimeMillis();;
        System.out.println("Duration with manual autoboxing [milliseconds]:  " + (time2-time1));       
 
        
        // without autoboxing: 
        time1 = System.currentTimeMillis();
        for(int i = 0; i<MAXVALUE; i++) {
            // some statements
        }
        time2 = System.currentTimeMillis();;
        System.out.println("Duration with primitive datatype int [milliseconds]:  " + (time2-time1));
    }
}
