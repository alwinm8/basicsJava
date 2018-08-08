package basicsJava;
import java.util.Scanner;

public class NumberPalindrome {
	
	public static void main(String args[])
	{
		int input;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter in an integer (no decimals) to be checked for palindrome.");
		input = userInput.nextInt();
		StringBuilder output = new StringBuilder(String.valueOf(input));
		String reverseoutput = output.reverse().toString();
		int intoutput = Integer.parseInt(reverseoutput);

		
		if(intoutput == input)
		{
			System.out.println("The integer provided is a palindrome!");
		}
		else
		{
			System.out.println("The integer provided is not a palindrome!");
		}
		userInput.close();	
	}

}
