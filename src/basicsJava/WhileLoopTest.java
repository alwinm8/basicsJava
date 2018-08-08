package basicsJava;
import java.lang.Math;

public class WhileLoopTest {

	public static void main(String[] args) 
	{
		int i = 20;
		while (i >= 1)
		{
			System.out.println("i: " + i--);	
		}
		
		i = 1;
		while (i <= 13)
		{
			i += 2;
			System.out.println("i2: " + i);
		}
		
		i = 5;
		int count;
		double result;
		count = 0;
		result = 0.0;
		while (count != 6)
		{
			count++;
			result = Math.pow(i, count);
			System.out.println("i3: " + (int)result);
		}

	}

}
