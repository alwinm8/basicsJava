package basicsJava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alwinmathew
 */
public class StoneMonster extends Monster
{
    public StoneMonster(String name)
    {
        super(name);
    }
    
    public String attack()
    {
        return "Attack with stones!";
    }
}
