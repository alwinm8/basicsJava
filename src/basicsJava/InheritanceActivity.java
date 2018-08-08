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


public class InheritanceActivity 
{

    public static void main(String[] args)
    {
        //Problem statement 1
        //test case 1
        Employee m1 = new Manager(126534L, "Peter", "Chennai, India", 237844L, 65000.0);
        m1.calculateSalary();
        //test case 2
        Employee t1 = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000.0);
        t1.calculateSalary();
        
        //Problem statement 2
        m1.calculateTransportAllowance();
        t1.calculateTransportAllowance();
    }
    
}
