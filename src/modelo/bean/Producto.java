package modelo.bean;

import java.util.Date;

/**
 * @author Galder
 * @version 24.04.2020
 *
 */
public class Producto {

	private int id;
	private String nombre;
	private int stock;
	private Date fecha_compra;
	private String color;
	private String made_in; // Name del estado
	private Double precio;
	private int descuento;
	private String tallas; // tallas separados por coma ej.: S,L

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
	 * @return devuelve el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter
	 * 
	 * @param nombre recibe como parametro y lo asingna al atributo
	 *            
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Setter
	 * 
	 * @param stock recibe como parametro y lo asingna al atributo           
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo fecha_compra
	 */
	public Date getFecha_compra() {
		return fecha_compra;
	}

	/**
	 * Setter
	 * 
	 * @param Fecha_compra recibe como parametro y lo asingna al atributo      
	 */
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter
	 * 
	 * @param color recibe como parametro y lo asingna al atributo          
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo made_in
	 */
	public String getMade_in() {
		return made_in;
	}

	/**
	 * Setter
	 * 
	 * @param Made_in recibe como parametro y lo asingna al atributo         
	 */
	public void setMade_in(String made_in) {
		this.made_in = made_in;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * Setter
	 * 
	 * @param precio recibe como parametro y lo asingna al atributo           
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo descuento
	 */
	public int getDescuento() {
		return descuento;
	}

	/**
	 * Setter
	 * 
	 * @param descuento recibe como parametro y lo asingna al atributo            
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el atributo tallas
	 */
	public String getTallas() {
		return tallas;
	}

	/**
	 * Setter
	 * 
	 * @param tallas recibe como parametro y lo asingna al atributo
	 */
	public void setTallas(String tallas) {
		this.tallas = tallas;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", stock=" + stock + ", fecha_compra=" + fecha_compra
				+ ", color=" + color + ", made_in=" + made_in + ", precio=" + precio + ", descuento=" + descuento
				+ ", tallas=" + tallas + "]";
	}

}
