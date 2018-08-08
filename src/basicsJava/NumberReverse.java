//Alwin Mathew
//This program displays the reversed integer from user input integer.
package basicsJava;
import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) 
	{
		int input;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a whole number number to be reversed.");
		input = userInput.nextInt();
		StringBuilder output = new StringBuilder(String.valueOf(input));
		output.reverse();
		System.out.println("The reversed number is: " + output.toString());
		userInput.close();
	}

}
