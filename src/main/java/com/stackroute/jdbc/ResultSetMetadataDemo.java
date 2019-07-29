package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public void showResultSetMetaData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root", "Root@123");

            PreparedStatement ps=con.prepareStatement("select * from Employee1");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

            con.close();
        }catch(Exception e){ System.out.println(e);}

}
}
