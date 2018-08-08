//Alwin Mathew
//This program will be able to calculate the area of a circle with a given input of radius.
package basicsJava;
import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) 
	{
		double input;
		double result;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter in the radius.");
		input = userInput.nextDouble();
		result = 3.14 * input * input;
		
		System.out.println("The area of the circle is : " + result + ".");
		
		
		userInput.close();

	}

}
