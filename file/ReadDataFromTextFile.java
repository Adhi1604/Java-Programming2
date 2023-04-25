package file;

import java.io.File;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) {
		try {
			File file = new File("D:Sample.txt"); 
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String a = sc.nextLine();
			System.out.println(a);	
			}
			
		}catch(Exception e) {
			
		}
		
		

	}

}
