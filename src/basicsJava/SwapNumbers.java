//Alwin Mathew
//This program will swap between two number variables.
package basicsJava;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a, b, temp = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter in #1.");
		a = userInput.nextInt();
		System.out.println("Please enter in #2.");
		b = userInput.nextInt();
		
		//swap numbers
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("#1: " + a);
		System.out.println("#2: " + b);


	}

}
