package com.stackroute.jdbc;

import java.sql.DatabaseMetaData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        System.out.println("employee detailes");
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println("employee detailes by name and gender");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("sankeerthana","Female");
        System.out.println("employee detailes in reverse");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println("employee detailes from second row reverse");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println("Database Meta Data");
        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.showDatabaseMetaData();
        System.out.println("ResultSetMetaData");
        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.showResultSetMetaData();
        System.out.println("JDBC BATCH DEMO");
        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        jdbcBatchDemo.batchDemoProcessing();
        System.out.println("Transaction Processing Demo");
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.showtransationprocess();
        System.out.println("row set data");
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.showRowSet();


    }
}
