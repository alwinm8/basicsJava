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
public class Employee 
{
    long employeeId;
    String employeeName;
    String employeeAddress;
    Long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;
    
    public Employee(long Id, String name, String address, long phone)
    {
        employeeId = Id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
    }
    
    public void calculateSalary()
    {
        double salary;
        salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
        System.out.println("The salary calculated for the employee " + employeeName + " is " + salary + ".");
    }
    
    //this function will set basic salary
    public void setSalary(double salary)
    {
        this.basicSalary = salary;
    }
    
    public double getSalary()
    {
        return basicSalary;
    }
    
    public void calculateTransportAllowance()
    {
        double transportAllowance = (10/100) * basicSalary;
        System.out.println("The transport allowance for employee " + employeeName + " is " + transportAllowance);

    }
}
