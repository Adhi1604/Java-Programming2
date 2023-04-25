package Arrays;

public class MaxMinValuesinArrays {

	public static void main(String[] args) {
	
		int a[] = {50,300,40,70,60};
		
		int max = a[0];
		for(int value : a) {
			if(value>max) {
				System.out.println(max=value);
			}
		}
		//System.out.println("Maximum value is : "+max);
		
//		int min = a[0];
//		for(int value : a) {
//			if(value<min) {
//				min=value;
//			}
//		}
//		System.out.println("Maximum value is : "+min);

	}

}
