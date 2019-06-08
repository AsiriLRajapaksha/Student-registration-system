
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Dbconnection {
    
    
    public static Connection connect(){
    
        Connection con = null;
        
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentd-info","root","");
        return con;
        
        }catch(ClassNotFoundException | SQLException e){
        
        System.out.println(e);
            
        }
        return null;
    }
    
}