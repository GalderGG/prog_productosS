package api;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONStringer;

import modelo.bean.Producto;
import modelo.dao.ModeloProducto;

/**
 * Servlet implementation class ApiProductos
 */
@WebServlet("/ApiProductos")
public class ApiProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloProducto modeloProducto = new ModeloProducto();
		ArrayList<Producto> productos = modeloProducto.getAll();
		
		String jsonString = JSONStringer.valueToString(productos);
		PrintWriter out = response.getWriter();
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		
		out.print(jsonString);
		out.flush();
		out.close();
		
		try {
			modeloProducto.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}