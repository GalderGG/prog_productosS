package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Estado;

/**
 * @author Galder
 * @version 24.04.2020
 *
 */
public class ModeloEstado extends Conector{

	/**
	 * Metodo que devuelve todos los estados
	 * 
	 * @return Arraylist de estados
	 */
	public ArrayList<Estado> getAll() {
		ArrayList<Estado> estados = new ArrayList<Estado>();

		try {
			PreparedStatement preparedStatement = conexion.prepareStatement("SELECT * FROM estados");
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Estado estado = new Estado();
				estado.setId(resultSet.getInt("id"));
				estado.setName(resultSet.getString("Name"));
				estado.setContinent(resultSet.getString("Continent"));

				estados.add(estado);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return estados;
	}
}
