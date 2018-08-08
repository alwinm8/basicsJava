package basicsJava;

//Alwin Mathew
//This program will take a length and width and produce the area of a rectangle

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaRectangle {

	public static void main(String[] args) 
	{
		double length, width, answerArea, answerPerimeter;
                DecimalFormat df = new DecimalFormat("#.##");          
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter in a number for length.");
		length = userInput.nextDouble();
		System.out.println("Please enter in a number for width.");
		width = userInput.nextDouble();
                answerArea = Double.valueOf(df.format(area(length, width)));
                answerPerimeter = Double.valueOf(df.format(perimeter(length, width)));
		System.out.println("The area of the Rectangle is: " + answerArea + "\tPerimiter is: " + answerPerimeter);
		userInput.close();
	}
	
	public static double area(double length, double width)
	{
		return length * width;
	}
	
	public static double perimeter(double length, double width)
	{
		return (2 * (width + length));
	}

}
