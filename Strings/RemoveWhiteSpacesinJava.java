package Strings;




public class RemoveWhiteSpacesinJava {

	public static void main(String[] args) {
		
		String s = "Java   Programing   language";
		System.out.println("Before Removing White Spaces: " +s);
		
		s = s.replaceAll("\\s","");
		System.out.println("After Removing White Spaces: " +s);

	}

}
