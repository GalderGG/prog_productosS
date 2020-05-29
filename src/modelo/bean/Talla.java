package modelo.bean;

/**
 * @author Galder
 * @version 24.04.2020
 *
 */
public class Talla {

	private int id;
	private String nombre;

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id recibe como prametro y lo asingna al atributo   
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter
	 * 
	 * @param nombre recibe como prametro y lo asingna al atributo       
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Talla [id=" + id + ", nombre=" + nombre + "]";
	}

}
