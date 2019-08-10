import java.util.*;

/**
 * 
 * Simple class that show you and describes plants in order
 * to recognise them.
 * 
 * @author janika kiss
 * @version 0.0.1
 * @since 10.8.2019
 **/
 
public class BylinkarSimple {

	ArrayList<Plant> plantList = new ArrayList<Plant>();
	
	
	public static void main(String[] args) {
		new BylinkarSimple().go();
	}

	public void go() {
		Plant p1 = new Plant("Kamilka", "Camomile", "12");
		System.out.println(p1.getLatName());
	}
}
