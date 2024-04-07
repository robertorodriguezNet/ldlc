package net.robertorodriguez.jdbc.util;

import java.sql.*;

public class DbConnection {


	private static final String URL = "jdbc:mysql://localhost:3306/ldlc";
	private static final String USER = "roberto";
	private static final String PASS = "0wq79s";
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		
		if(connection == null) {
			connection = DriverManager.getConnection(URL, USER, PASS);
		}
		return connection;
		
	}
	
}
