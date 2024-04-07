package net.robertorodriguez.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	private static final String URL = "jdbc:mysql://localhost:3306/ldlc";
	private static final String USER = "roberto";
	private static final String PASS = "0wq79s";

	public static void main(String[] args) {

		try (
				Connection connection = DriverManager.getConnection(URL, USER, PASS);
				Statement statement = connection.createStatement();
			) {

			ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");

			while (resultSet.next()) {
				System.out.println(
						String.format("%14s", resultSet.getString("barcode")) 
						+ " "
						+ resultSet.getString("denominacion"));
			}
			
			resultSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
