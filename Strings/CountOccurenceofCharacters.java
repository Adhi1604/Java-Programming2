package Strings;

public class CountOccurenceofCharacters {

	public static void main(String[] args) {
		
		String s = "Java Programming Java oops";
		
		int totalcount = s.length();
		System.out.println(totalcount);
		int totalcount_afterRemove = s.replace("o"	,"").length();
		System.out.println(totalcount_afterRemove);
		
		int count = totalcount - totalcount_afterRemove;
		System.out.println("Number occurences of o is :"+count);
	}
}
