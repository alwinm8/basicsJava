//Alwin Mathew
//This program will take an input of String and provide the palindrome.
package basicsJava;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String input;
		System.out.println("Please enter a string to be checked for palindrome.");
		Scanner userInput = new Scanner(System.in);
		input = userInput.nextLine();
		
		StringBuilder output = new StringBuilder(input);
		String reverseoutput = output.reverse().toString();
		
		if(reverseoutput.equals(input))
		{
			System.out.println("The provided string is a palindrome!");
		}
		else
		{
			System.out.println("The provided string is not a palindrome.");
		}
		
		userInput.close();
	}

}
