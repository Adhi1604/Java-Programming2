package Strings;

public class RemoveSpecialCharactersinString {//Remove Junk

	public static void 
(String[] args) {
		
		String s = "`$%^&*)*& latin String 0123456789";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}

+