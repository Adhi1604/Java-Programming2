package Arrays;

public class SumofElementsinArray {

	public static void main(String[] args) {
		
		int a[] = {0,3,7,6,9};
		int sum = 0;
		
		for(int value :a) {
			sum = sum+value;
		}
	    System.out.println("Sum Of Elements is: " + sum);
	}

}
