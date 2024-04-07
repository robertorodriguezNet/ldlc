package net.robertorodriguez.jdbc.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import net.robertorodriguez.jdbc.entities.Producto;
import net.robertorodriguez.jdbc.util.DbConnection;

public class ProductoDAOImp implements Repository<Producto> {

	private Connection getConnection() throws SQLException {
		return DbConnection.getConnection();
	}

	@Override
	public List<Producto> findAll() {
		List<Producto> productos = new ArrayList<>();
		
		try (Statement statement = getConnection().createStatement();
				ResultSet resultSet = 
						statement.executeQuery(
								"SELECT * "
								+ "FROM productos as p "
								+ "INNER JOIN marcas as mr ON (p.marca_id = mr.id "
								+ "INNER JOIN medidas as md ON (p.medida_id = md.id)"
								);
			) {
			
			while (resultSet.next())
				productos.add( createProducto(resultSet) );
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return productos;
	}
	
	@Override
	public Producto findById(Long id) {
			
		try(
			PreparedStatement statement = 
				getConnection().prepareStatement("SELECT * FROM productos WHERE id=?");
		){
			
			statement.setLong(1, id);
			try(ResultSet resultSet = statement.executeQuery()){			
				if(resultSet.next()) 
					return createProducto(resultSet);				
			}			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return new Producto();
	}

	/**
	 * Se guarda el producto tanto si es una actualización como si es nuevo.
	 * Si el id del producto es 0, es un producto nuevo.
	 */
	@Override
	public void save(Producto p) {
		
		String sql = (isUpdate(p))? "INSERT INTO productos "
				+ "(barcode, denominacion, marca_id, unidades, medida_id, cantidad) "
				+ "VALUES(?,?,?,?,?,?)" :
				"UPDATE productos SET "
				+ "barcode=?, denominacion=?, marca_id=?, unidades=?, medida_id=?, cantidad=? "
				+ "WHERE id=?";
		
		try ( PreparedStatement statement = getConnection().prepareStatement(sql)
		){			
			statement.setLong(1, p.getBarcode());
			statement.setString(2, p.getDenominacion());
			statement.setInt(3, p.getMarca_id());
			statement.setInt(4, p.getUnidades());
			statement.setInt(5, p.getMedida_id());
			statement.setDouble(6, p.getCantidad());
			
			if(isUpdate(p)) 
				statement.setLong(7, p.getId());
			
			statement.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Long id) {

		try(PreparedStatement statement = 
				getConnection().prepareStatement("DELETE FROM productos WHERE id=?")){
			
			statement.setLong(1, id);
			statement.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private boolean isUpdate(Producto p) {
		return p.getId() > 0;
	}
	
	private Producto createProducto(ResultSet rs) throws SQLException {
		return new Producto(
			rs.getLong("id"),
			rs.getLong("barcode"),
			rs.getString("denominacion"),
			rs.getInt("marca_id"),
			rs.getInt("unidades"),
			rs.getInt("medida_id"),
			rs.getDouble("cantidad")				
		);
	}

}
