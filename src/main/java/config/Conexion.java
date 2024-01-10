/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan Bedoya
 */
public class Conexion {

    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_talentohumano";
    String user="root";
    String pass="Juanbedoya2003";

    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
        return con;
    }
}