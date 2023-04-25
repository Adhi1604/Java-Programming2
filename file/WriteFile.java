package file;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
			
			FileWriter ab = new FileWriter("D:Sample.txt");
			           ab.write("Java programming language");
			           ab.write(" Welcome");
			           ab.close();
			File ob = new File("D:Sample.txt");
			System.out.println(ob.length());
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
