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
public class Trainee extends Employee
{
    public Trainee(long Id, String name, String address, long phone, double salary)
    {
       super(Id, name, address, phone);  
       super.basicSalary = salary;
    }
    
    @Override
    public void calculateSalary()
    {
        double salary;
        salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
        System.out.println("The salary calculated for the employee " + employeeName + " is " + salary + ".");
    }
    
}
