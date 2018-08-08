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
public class Manager extends Employee
{
    public Manager(long Id, String name, String address, long phone, double salary)
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
    
    @Override
    public void calculateTransportAllowance()
    {
        double transportAllowance = 15 * basicSalary /100;
        System.out.println("The transport allowance for employee " + employeeName + " is " + transportAllowance);
    }
}
