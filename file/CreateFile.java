package file;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File ab = new File("D:Sample.txt");
			  if(ab.createNewFile()) {
				 System.out.println("File "+ab.getName()+" Created sucessfully");
			  }
			  else {
				  System.out.println("The File already exit");
			  }
		}catch(Exception e){
			System.out.println(e);
		}
		  
		
	
	}
}
