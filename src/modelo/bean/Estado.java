package modelo.bean;

/**
 * @author Galder
 * @version 24.04.2020
 *
 */
public class Estado {

	private int id;
	private String name;
	private String continent;

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
	 * @param id recibe como parametro y lo asingna al atributo           
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name recibe como parametro y lo asingna al atributo            
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo continent
	 */
	public String getContinent() {
		return continent;
	}

	/**
	 * Setter
	 * 
	 * @param continent recibe como parametro y lo asingna al atributo          
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", name=" + name + ", continent=" + continent + "]";
	}

}
