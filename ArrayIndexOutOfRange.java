package ExceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.
			This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.
			Sample Input and Output 1:
			Enter the number of elements in the array
			3
			Enter the elements in the array
			20
			90
			4
			Enter the index of the array element you want to access
			2
			The array element at index 2 = 4
			The array element successfully accessed
			
			Sample Input and Output 2:
			Enter the number of elements in the array
			3
			Enter the elements in the array
			20
			90
			4
			Enter the index of the array element you want to access
			6
			java.lang.ArrayIndexOutOfBoundsException

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
	    
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
	    try {
			int num = arr[index];
			System.out.print("The array element at index 2 =" + num);
			System.out.print("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		
		
		
		
		

	}
