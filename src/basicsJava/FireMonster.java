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
public class FireMonster extends Monster 
{

  
    public FireMonster(String name)
    {
        super(name);
    }
    
    @Override
    public String attack()
    {
        return "Attack with fire!";
    }
}
