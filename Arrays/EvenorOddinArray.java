package Arrays;

import java.util.Arrays;

public class EvenorOddinArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
	System.out.println("Even Numbers..");	
		for(int value : a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		
	System.out.println("odd Numbers..");	
		for(int value : a) {
			if(value%2 != 0) {
				System.out.println(value);
			}
		}
 
	}

}
