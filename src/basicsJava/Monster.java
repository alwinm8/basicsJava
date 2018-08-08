package basicsJava;

//Alwin Mathew
//These is the super class monster which other monsters extends from.
public class Monster 
{
    String name;
    
    public Monster(String name)
    {
        this.name = name;
    }
    
    public String attack()
    {
        return "!^&^$@+%$* I don't know how to attack!";
    }
}
