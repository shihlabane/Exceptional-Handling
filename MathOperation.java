package ExceptionHandling;

import java.util.Scanner;

public class MathsOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Write a class MathOperation which accepts integers from command line. 
		 Create an array using these parameters. Loop through the array and 
		 obtain the sum and average of all the elements. Display the result.
		 Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
		For example: The class would be invoked as follows:
		C:>java MathOperation 1900, 4560, 0, 32500

		 */
		Scanner sc = new Scanner(System.in);
		int[] arr;
		System.out.println("Enter the number of elemets in the array");
		int numElements = sc.nextInt();
		arr = new int[numElements];
		System.out.println("Enter the elemets in the array");
		
		int count = 0;
	    while(count!= numElements) {
	    	
	    	int elements = sc.nextInt();	
	    	arr[count] = elements;
	    	count++;
	    }
	    
		
		try {
			int sum = 0,avrg=0;
			for(int i =0 ; i < arr.length; i++) {
				
				sum = sum + arr[i];
				
			}
			
			avrg = sum/ arr.length;
			
			System.out.println("Sum  of the array element :" + sum);
			System.out.print("Average of the array element :" + avrg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("e.getMessage()");
		}

	}

}
