package genericmethod1;


public class MyUtil {

	public static<T> T random(T m, T n) {
		    return Math.random() > 0.5? m:n;
		  }

}
