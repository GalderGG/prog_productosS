package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import modelo.Conector;
import modelo.bean.Talla;

/**
 * @author Galder
 * @version 24.04.2020
 */
public class ModeloTalla extends Conector {

	/**
	 * Metodo que devuelve todas las tallas
	 * 
	 * @return Arraylist Tallas
	 */
	public ArrayList<Talla> getAll() {
		ArrayList<Talla> tallas = new ArrayList<Talla>();

		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM tallas");

			while (resultSet.next()) {
				Talla talla = new Talla();
				talla.setId(resultSet.getInt("id"));
				talla.setNombre(resultSet.getString("nombre"));
				tallas.add(talla);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tallas;
	}
}
