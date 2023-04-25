package file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		try {
			File ab = new File("D:Sample.txt");
			
			if(ab.delete()) {
				System.out.println(ab.getName() + " deleted");
			}
			else {
				System.out.println("File not Found");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
