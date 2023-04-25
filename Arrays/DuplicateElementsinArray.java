package Arrays;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
//Approch 2: hashset
		
		String a[] = {"java","c","python","java","c"};
		HashSet <String>langs = new HashSet<>();
		
		boolean flag = false;
		for(String i:a) {
			if(langs.add(i)==false) {
				System.out.println("Duplicate Element is: "+i);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Duplicate Element Not Found");
		}
	}

}
