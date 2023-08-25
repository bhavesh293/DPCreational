package com.company.project.objectpool;

import java.sql.Connection;

class Main {
    public static void main(String args[])
    {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
        		"com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/testdb","root","mysql_123");  
 
        // Get a connection:
        Connection con = pool.takeOut();
        // Return the connection:
        pool.takeIn(con);
    }
}