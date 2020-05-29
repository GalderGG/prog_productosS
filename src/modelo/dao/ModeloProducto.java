package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

/**
 * @author Galder
 * @version 24.04.2020
 */
public class ModeloProducto extends Conector {

	/**
	 * Metodo que devuelve un todos los productos de la base de datos
	 * 
	 * @return Arraylist de Productos
	 */
	public ArrayList<Producto> getAll() {
		ArrayList<Producto> productos = new ArrayList();

		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");
			while (resultSet.next()) {
				Producto producto = new Producto();
				producto.setId(resultSet.getInt("id"));
				producto.setNombre(resultSet.getString("nombre"));
				producto.setStock(resultSet.getInt("stock"));
				producto.setFecha_compra(resultSet.getDate("fecha_compra"));
				producto.setColor(resultSet.getString("color"));
				producto.setMade_in(resultSet.getString("made_in"));
				producto.setPrecio(resultSet.getDouble("precio"));
				producto.setDescuento(resultSet.getInt("descuento"));
				producto.setTallas(resultSet.getString("tallas"));

				productos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}

	/**
	 * Metodo que devuelve un producto cuando el id del parameto coincide
	 * 
	 * @param id
	 * @return Producto
	 */
	public Producto get(int id) {
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement("SELECT * FROM productos WHERE id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			Producto producto = new Producto();

			while (resultSet.next()) {
				producto.setId(resultSet.getInt("id"));
				producto.setNombre(resultSet.getString("nombre"));
				producto.setStock(resultSet.getInt("stock"));
				producto.setFecha_compra(resultSet.getDate("fecha_compra"));
				producto.setColor(resultSet.getString("color"));
				producto.setMade_in(resultSet.getString("made_in"));
				producto.setPrecio(resultSet.getDouble("precio"));
				producto.setDescuento(resultSet.getInt("descuento"));
				producto.setTallas(resultSet.getString("tallas"));
			}
			return producto;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Metodo que agrega el producto que recibe como parametro
	 * 
	 * @param producto
	 */
	public void insert(Producto producto) {
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement("INSERT INTO productos (nombre, stock, fecha_compra, color, made_in, precio, descuento, tallas) VALUES (?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, producto.getNombre());
			preparedStatement.setInt(2, producto.getStock());
			preparedStatement.setDate(3, new java.sql.Date(producto.getFecha_compra().getTime()));
			preparedStatement.setString(4, producto.getColor());
			preparedStatement.setString(5, producto.getMade_in());
			preparedStatement.setDouble(6, producto.getPrecio());
			preparedStatement.setInt(7, producto.getDescuento());
			preparedStatement.setString(8, producto.getTallas());

			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que actualiza el producto que recibe como parametro
	 * 
	 * @param producto
	 */
	public void update(Producto producto) {
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement("UPDATE productos SET nombre=?, stock=?, fecha_compra=?, made_in=?, precio=?, descuento=?, tallas=?");
			producto.setNombre(producto.getNombre());
			producto.setStock(producto.getStock());
			producto.setFecha_compra(producto.getFecha_compra());
			producto.setMade_in(producto.getMade_in());
			producto.setPrecio(producto.getPrecio());
			producto.setDescuento(producto.getDescuento());
			producto.setTallas(producto.getTallas());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo que elimina el producto que recibe como parametro
	 * 
	 * @param id
	 */
	public void delete(int id) {
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement("DELETE FROM productos WHERE id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo que devuelve los productos que coincidan con la talla introducida como
	 * parametro
	 * 
	 * @param talla
	 * @return Arraylist de productos
	 */
	public ArrayList<Producto> deLaTalla(Talla talla) {
		// TODO implementar, un poco mas dificil
		return null;
	}
}
