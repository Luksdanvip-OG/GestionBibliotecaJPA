package controlladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlladores.operaciones.OperacionesAdministrador;

@WebServlet("/ControladorAdministrador")
public class ControladorAdministrador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControladorAdministrador() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OperacionesAdministrador.operacionGet(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OperacionesAdministrador.operacionPost(request, response);
	}

	

	

}