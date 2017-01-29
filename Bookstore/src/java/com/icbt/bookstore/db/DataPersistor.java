/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.bookstore.db;

import com.icbt.bookstore.bean.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author icbt
 */
public class DataPersistor {
    private Connection con;
    User user;
    private ResultSet rs;
    public DataPersistor(){
    con=DbConnector.getConnection();
    }
    public void InsertUser(User user)
    {
       
        try{
       String sql="insert into user (firstname,lastname,email,username,password,user_level) values('"+user.getFirstname()+"','"+user.getLastname()+"','"+user.getEmail()+"','"+user.getUsername()+"','"+user.getPassword()+"','user')";
       Statement stmt=con.createStatement();
       stmt.execute(sql);
    }
        catch(SQLException ex){
            System.err.println("Error inserting data"+ex);
            
        }
        
    }

    public ResultSet GetUsers() {
         try{
       String Query="select*from user";
       Statement stmt=con.createStatement();
       rs = stmt.executeQuery(Query);
       
       
    }
        catch(SQLException ex){
            System.err.println("Error query data"+ex);
            
        }
       return rs;
    }
    
}
