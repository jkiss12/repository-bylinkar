import java.util.*;
import java.io.*;

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
		readAFile(); 
		System.out.println(plantList);
		
	}
	
	void readAFile() {
		
		try {
			File file = new File("src/Bylinky.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine())!= null) {
				makePlant(line);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void makePlant(String lineToParse) {
		String[] part = lineToParse.split("/");
		Plant  nextPlant = new Plant(part[0], part[1], part[2]);
		plantList.add(nextPlant);
	}
}
