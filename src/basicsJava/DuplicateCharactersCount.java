package basicsJava;

//Alwin Mathew
//This program will ask the user to input a string and will find the characters and count of duplicates.
//package basicsJava;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCount {

	public static void main(String[] args) 
	{
		String input;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a string to find the count of duplicate characters.");
		input = userInput.nextLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			if(map.containsKey(c))
			{
				int count = map.get(c);
				map.put(c, ++count);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		userInput.close();

	}

}
