package com.company.project.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Three methods are abstract
//and therefore must be implemented by the subclass

class JDBCConnectionPool extends ObjectPool<Connection> {
 String dsn, usr, pwd;

 @SuppressWarnings("deprecation")
JDBCConnectionPool(String driver, String dsn, String usr, String pwd)
 {
     super();
     try {
         Class.forName(driver).newInstance();
     }
     catch (Exception e) {
         e.printStackTrace();
     }
     this.dsn = dsn;
     this.usr = usr;
     this.pwd = pwd;
 }

 Connection create()
 {
     try {
         return (DriverManager.getConnection(dsn, usr, pwd));
     }
     catch (SQLException e) {
         e.printStackTrace();
         return (null);
     }
 }

 void dead(Connection o)
 {
     try {
         ((Connection)o).close();
     }
     catch (SQLException e) {
         e.printStackTrace();
     }
 }

 boolean validate(Connection o)
 {
     try {
         return (!((Connection)o).isClosed());
     }
     catch (SQLException e) {
         e.printStackTrace();
         return (false);
     }
 }
}
