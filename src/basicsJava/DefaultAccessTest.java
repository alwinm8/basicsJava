//Alwin Mathew
//This program will show a scenario where the default access modifier for classes have certain permission.
//For default - same class, same package sub class, same package non subclass.

package basicsJava;

public class DefaultAccessTest 
{

	public static void main(String[] args) 
	{
		Animal sample = new Animal();
		sample.setColor("Black");
		sample.setName("Johnny");
		sample.setHeight(5.72);
		sample.setHeight(151);
		
		Animal sample2 = new Animal();
		sample2.setColor("Green");
		sample2.setName("Jeff");
		sample2.setHeight(1.11);
		sample2.setHeight(188);
		
		

	}

}
