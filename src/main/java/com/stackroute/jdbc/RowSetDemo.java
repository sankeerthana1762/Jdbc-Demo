package com.stackroute.jdbc;
import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo  {
    public void showRowSet() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/student");
            //setting username for mysql
            rowSet.setUsername("root");
            //setting password for mysql
            rowSet.setPassword("Root@123");
             //setting command
            rowSet.setCommand("select * from Employee1");
            //executing command
            rowSet.execute();
            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("employeeId: " + rowSet.getString(1));
                System.out.println("EmployeeName: " + rowSet.getString(2));
                System.out.println("EmployeeAge: " + rowSet.getString(3));
                System.out.println("EmployeeGender:"+rowSet.getString(4));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    }