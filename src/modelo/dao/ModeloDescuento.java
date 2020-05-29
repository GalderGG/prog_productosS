package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Descuento;

/**
 * @author Galder
 * @version 24.04.2020
 *
 */
public class ModeloDescuento extends Conector {

	/**
	 * Metodo que devuelve todos los descuentos
	 * 
	 * @return Arraylist de descuentos
	 */
	public ArrayList<Descuento> getAll() {
		ArrayList<Descuento> descuentos = new ArrayList<Descuento>();

		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM descuentos");

			while (resultSet.next()) {

				Descuento descuento = new Descuento();
				descuento.setId(resultSet.getInt("id"));
				descuento.setValor(resultSet.getInt("valor"));
				descuento.setDescripion(resultSet.getString("descripcion"));

				descuentos.add(descuento);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return descuentos;

	}

}
