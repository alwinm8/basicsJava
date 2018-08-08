//Alwin Mathew
//This program will accept any string input and remove white spaces.
package basicsJava;
import java.util.Scanner;

public class WhileSpaceRemove {

	public static void main(String[] args) 
	{
		String temp, result;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter text to remove whitespace from.");
		temp = userInput.nextLine();
		StringBuilder string1 = new StringBuilder(temp);
		
		string1 = new StringBuilder(string1.toString().replaceAll("\\s", ""));
		System.out.println("The result of the whitespace removal: " + string1.toString());

		
	}

}
