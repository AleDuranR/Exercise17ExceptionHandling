package com.exercise17exceptionhandling.app;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MyExceptions {

	public static void main(String[] args) {
		// Variables declaration
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int number1 = 0;
		Scanner scan = new Scanner(System.in);
		// C L A S S _ E X C E P T I O N 
		for(int i = 0; i< 11; i++) {
			// Try it's always with a catch('TypeError' that is an Exception Object)
			try {
				System.out.format("Element %d is %d \n", i+1 , numbers[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Hey! be careful you are not directing to a valid index");
			}
			finally {
				System.out.println("The try-catch finally end");
			}	
		}
		
		// Ask for 10 numbers and save it in the array
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("Input number between 0-10:");
				numbers[i] = scan.nextInt();
			} catch(NumberFormatException e) {
				System.out.println("Hey! the number you input is wrong. Do it again!!");
				scan.next();
				i--;
				
			} catch(InputMismatchException e) {
				System.out.println("Hey! the number you input is wrong. Do it again!!");
				scan.next();
				i--;
			} finally {
				//
			}
			
		}
		for(int k = 0; k < numbers.length; k++) {
			System.out.format("%d \n", numbers[k]);
		}
	}
}
