package basicsJava;

class Animal {

	double height, weight;
	String color, name;
	Animal example; //can create Animals within the same class
	
	
	void setWeight(double weight)
	{
		this.weight = weight;
	}
	void setHeight(double height)
	{
		this.height = height;
	}
	void setColor(String color)
	{
		this.color = color;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void printInfo()
	{
		System.out.println("Name: " + name + " Color: " + color + "Height :" + height + "Weight : " + weight);
	}

}

