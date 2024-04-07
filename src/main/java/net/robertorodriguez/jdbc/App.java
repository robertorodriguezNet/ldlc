package net.robertorodriguez.jdbc;

import java.sql.*;

import net.robertorodriguez.jdbc.entities.Producto;
import net.robertorodriguez.jdbc.repository.ProductoDAOImp;
import net.robertorodriguez.jdbc.repository.Repository;
import net.robertorodriguez.jdbc.util.DbConnection;

public class App {

	public static void main(String[] args) {
		
		try (Connection connection = DbConnection.getConnection()) {

			Repository<Producto> productos = new ProductoDAOImp();
//			productos.findAll().forEach(System.out::println);
			
//			System.out.println(productos.findById(56L));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
