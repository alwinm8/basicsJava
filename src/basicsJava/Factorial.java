//Alwin Mathew
//Takes a number as input and calls the factorial function.
package basicsJava;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int input, factorial = 0;
		System.out.println("Please enter a whole number to calculate the factorial");
		Scanner userInput = new Scanner(System.in);
		input = userInput.nextInt();
		factorial = Factorial.factorial(input);
		System.out.println("The factorial is: " + factorial + ".");
	}
	
	//simple factorial implementation
	public static int factorial(int number) 
	{
		int factorial = 1;
		
		if (number < 0)
		{
           new IllegalArgumentException("Number must be >= 0.");
		}
        
        for (int i = 2; i <= number; i++)
        {
            factorial *= i;               
        }
        
        return factorial;
    }

}
