package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {
    private Connection connection;
    public  void  batchDemoProcessing() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root@123");
            connection.setAutoCommit(false);
        }catch (SQLException|ClassNotFoundException e){
            e.printStackTrace();
            try {

                Statement stmt = connection.createStatement();
                stmt.addBatch("insert into Employee1 values(105,'roopa',15,'Female')");
                stmt.addBatch("insert into Employee1 values(106,'ravi',17,'Male')");

                stmt.executeBatch();//executing the batch
                System.out.println("Batch processing Executed");
                connection.commit();
                connection.close();

            }catch (SQLException sqle){
                sqle.printStackTrace();
            }



        }

    }
}
