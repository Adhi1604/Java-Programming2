package Strings;

import java.util.Arrays;

public class ChangeOccurenceofCharacter {

	public static void main(String[] args) {
		
		String str = "aadhithyan";
		char change = 'a';
		
		if(str.indexOf(change)==-1) {
			System.out.println("Character not available");
			System.exit(0);
		}
		char a[] = str.toCharArray();
		int count = 1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==change) {
				a[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
