/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thogakade;

import dbconnection.thogakade.DBConnection;
import java.sql.*;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection a1=DBConnection.getInstance().getConnection();
        System.out.println(a1);
    }
         
    
}