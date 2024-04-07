package net.robertorodriguez.jdbc;

import java.sql.*;

import net.robertorodriguez.jdbc.util.DbConnection;

public class App {

	public static void main(String[] args) {

		try (
				Connection connection = DbConnection.getConnection();
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
