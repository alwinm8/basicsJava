package basicsJava;

public class Problem26 {

	public static void main(String[] args) 
	{
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		double average;
		int min, max, sum;
		min = max = sum = my_array[0];
		for (int i = 1; i < my_array.length; i++)
		{
			int tempValue = my_array[i];
			sum += tempValue;
			min = Math.min(min, tempValue);
			max = Math.max(max, tempValue);
		}
		sum -= min + max;
		average = sum / (my_array.length - 2);
		System.out.println("The result is :" + average);
	}

}
