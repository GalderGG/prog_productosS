package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

public class ModeloProducto extends Conector{

	public ArrayList<Producto> getAll(){
		ArrayList<Producto> productos = new ArrayList();
		int id, stock, descuento;
		String nombre, color, made_in, tallas; 
		Date fecha_compra;
		Double precio;

		
		
		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");
			while (resultSet.next()) {
				id = resultSet.getInt("id");
				nombre = resultSet.getString("nombre");
				stock = resultSet.getInt("stock");
				fecha_compra = resultSet.getDate("fecha_compra");
				color = resultSet.getString("color");
				made_in = resultSet.getString("made_in");
				precio = resultSet.getDouble("precio");
				descuento = resultSet.getInt("descuento");
				tallas = resultSet.getString("tallas");
				
				Producto producto = new Producto();
				
				producto.setId(id);
				producto.setNombre(nombre);
				producto.setStock(stock);
				producto.setFecha_compra(fecha_compra);
				producto.setColor(color);
				producto.setMade_in(made_in);
				producto.setPrecio(precio);
				producto.setDescuento(descuento);
				producto.setTallas(tallas);
				
				productos.add(producto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}
	
	public Producto get(int id) {
		//TODO implementar
		return null;
	}
	
	public void insert(Producto producto) {
		//TODO implementar
	}
	
	public void update(Producto producto) {
		//TODO implementar
	}
	
	public void delete(int id) {
		//TODO implementar
	}
	
	public ArrayList<Producto> deLaTalla(Talla talla){
		//TODO implementar, un poco mas dificil
		return null;
	}
}
	


