//Alwin Mathew
//This program demonstrates a switch statement, takes input from user using Scanner class..
package basicsJava;
import java.util.Scanner;
import java.lang.Math;


class OutOfBoundsException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfBoundsException()
    {
        System.out.println("You entered a number out of range!");
    }
}

public class SwitchTest {

	public static void main(String[] args) throws OutOfBoundsException 
	{
		int input;
		double rand, result = 0.0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter in a number to give you a random number times the number.");
		input = userInput.nextInt();
		
		if(input < 0 || input > 9)
		{
			throw new OutOfBoundsException();
		}
		
		rand = Math.random();
		
		switch (input)
		{
		case 0:result =  rand*input;
			break;
		case 1:result =  rand*input;
			break;
		case 2:result =  rand*input;
			break;
		case 3:result =  rand*input;
			break;
		case 4:result =  rand*input;
			break;
		case 5:result =  rand*input;
			break;
		case 6:result =  rand*input;
			break;
		case 7:result =  rand*input;
			break;
		case 8:result =  rand*input;
			break;
		case 9:result =  rand*input;
			break;	
		}
		
		System.out.println("The result of the function is " + result + ".");

	}
	
	static int factorial(int n) 
	{
		   if (n == 0)
		      return 1;
		   else
		      return (n * factorial(n-1));
	}

}

