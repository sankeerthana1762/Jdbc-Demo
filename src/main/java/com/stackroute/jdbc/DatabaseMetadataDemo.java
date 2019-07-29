package com.stackroute.jdbc;

import java.sql.*;

import static java.lang.Class.forName;
import static java.sql.DriverManager.getConnection;

public class DatabaseMetadataDemo {
    public void showDatabaseMetaData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root", "Root@123");
            DatabaseMetaData dbmd=con.getMetaData();

            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}