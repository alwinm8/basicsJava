//Alwin Mathew
//This program will check to see if a input number is an even or odd number
package basicsJava;

import java.util.Scanner;


public class EvenOrOdd {
	
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a whole number.");
		int input = userInput.nextInt();
		int result = input % 2;
		
		if (result == 0)
		{
			//The result will be an even number.
			System.out.println("The result is an even number.");
		}
		else
		{
			System.out.println("The result is an odd number.");
		}
		
		userInput.close();
	}
	
}
