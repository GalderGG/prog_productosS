package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase crea la conexion a la base de datos con los datos de config
 * 
 * @author Galder
 * @version 24.04.2020
 * @see modelo.Config
 *
 */
public class Conector {

	protected Connection conexion;

	/**
	 * Constructor sin parametros
	 * 
	 */
	protected Conector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD,
					Config.USERNAME, Config.PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * Setter
	 * 
	 * @param conexion recibe como prametro conexion y lo asingna al atributo
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

}