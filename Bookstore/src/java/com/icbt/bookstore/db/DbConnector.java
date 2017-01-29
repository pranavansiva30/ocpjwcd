/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.bookstore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author icbt
 */
public class DbConnector {

    private static Connection con;

    public static void createConnection(String dburl, String dbUsername, String dbPassword) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dburl, dbUsername, dbPassword);
            System.out.println("connection created");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
    public static void closeConnection(){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    public static Connection getConnection(){
    return con;}
}