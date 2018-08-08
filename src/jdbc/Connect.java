/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;

/**
 *
 * @author alwinmathew
 */
public class Connect 
{
    //Standard Statments
    static Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;
    
    static String url = "jdbc:mysql://localhost:3306/classicmodels";
    static String user = "root";
    static String pass = "ez$808LF";
    
    public static void main(String[] args)
    {
        try
        {
            myConn = DriverManager.getConnection(url, user, pass);
            System.out.println("The connection is successful!");
        }
        catch (SQLException e)
        {
            System.out.println("The connection has failed with exception" + e);
        } 
    }
    
}
