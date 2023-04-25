package file;

import java.io.File;

public class ExitFile {

	public static void main(String[] args) {
		
		try {
			File ab = new File("D:Sample.txt");
			if(ab.exists()) {
				System.out.println(ab.getName());
				System.out.println(ab.getAbsolutePath());
				System.out.println(ab.canRead());
				System.out.println(ab.canWrite());
				System.out.println(ab.length());
			}
			else {
				System.out.println("The File does not exist");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
