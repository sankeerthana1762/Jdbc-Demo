package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {
    public void showtransationprocess()
    {
        Connection connection=null;

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");
                connection.setAutoCommit(false);
        }catch (SQLException|ClassNotFoundException e){
        e.printStackTrace();
    }
        try
        {
            Statement stmt = connection.createStatement();

            int i1=stmt.executeUpdate("insert into Employee1 values(107,'prava',22,'Female')");
            int i2=stmt.executeUpdate("insert into Employee1 values(107,'srava',18,'Female')");

            connection.commit();
            System.out.println("Transaction is success");
        }//end of try
        catch (Exception e)
        {
            try
            {
                connection.rollback();
                System.out.println("Trasaction is failed");
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }
        }//end of catch
        } //end of main
}
