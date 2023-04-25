package Strings;

public class ReverseWordsinStrings {

	public static void main(String[] args) {
		
		String str = "Welcome to Java";  //original string
		String[] words = str.split(" "); //split into multiple words
		String reverseword= "";
		
		for(String w:words) {
			StringBuffer sb = new StringBuffer(w);
			             sb.reverse();
			reverseword = reverseword + sb.toString()+" ";
		}
       System.out.println(reverseword);
	}

}
