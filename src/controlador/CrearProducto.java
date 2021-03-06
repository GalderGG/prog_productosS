package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Descuento;
import modelo.bean.Estado;
import modelo.bean.Talla;
import modelo.dao.ModeloDescuento;
import modelo.dao.ModeloEstado;
import modelo.dao.ModeloTalla;

/**
 * Servlet implementation class CrearProducto
 */
@WebServlet("/CrearProducto")
public class CrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloEstado modeloEstado = new ModeloEstado();
		ModeloDescuento modeloDescuento = new ModeloDescuento();
		ModeloTalla modeloTalla = new ModeloTalla();
		
		ArrayList<Estado> estados = modeloEstado.getAll();
		ArrayList<Descuento> descuentos = modeloDescuento.getAll();
		ArrayList<Talla> tallas = modeloTalla.getAll();
		
		request.setAttribute("estados", estados);
		request.setAttribute("descuentos", descuentos);
		request.setAttribute("tallas", tallas);
		
		request.getRequestDispatcher("CrearProducto.jsp").forward(request, response);
		
		try {
			modeloEstado.getConexion().close();
			modeloDescuento.getConexion().close();
			modeloTalla.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
