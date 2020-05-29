package modelo.bean;

/**
 * @author Galder
 * @version 24.04.2020
 *
 */
public class Descuento {
	private int id;
	private int valor;
	private String descripcion;

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
	 * @return valor devuelve el atributo
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Setter
	 * 
	 * @param valor recibe como parametro y lo asingna al atributo           
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * Getter
	 * 
	 * @return descripion devuelve el atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter
	 * 
	 * @param descripcion recibe como parametro y lo asingna al atributo      
	 */
	public void setDescripion(String descripion) {
		this.descripcion = descripion;
	}

	@Override
	public String toString() {
		return "Descuento [id=" + id + ", valor=" + valor + ", descripion=" + descripcion + "]";
	}

}
