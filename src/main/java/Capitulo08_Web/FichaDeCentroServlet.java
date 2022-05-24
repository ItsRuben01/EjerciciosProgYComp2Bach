package Capitulo08_Web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FichaDeCentroServlet")
public class FichaDeCentroServlet extends HttpServlet {
	String respuesta = "";

	private static final long serialVersionUID = 1L;


	
    public FichaDeCentroServlet() {
        super();

    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String tipo = request.getParameter("tipo");
		String denominacion = request.getParameter("denominacion");
		String direccion = request.getParameter("direccion");
		String poblacion = request.getParameter("poblacion");
		String provincia = request.getParameter("provincia");
	
		

		this.respuesta = "<!DOCTYPE html> "
				+ "<html> "
				+ "<head>"
				+ "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />"
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Administración Centros</title> "
				+ "</head> "
				+ "<body> "
				+ "<h1>Ficha centros</h1>"
				+ "<form method='GET' action='FichaDeCentroServlet'>";
		
		if (tipo != null) {
			modificar(id, tipo, denominacion, direccion, poblacion, provincia);
		}

		mostrarCentro (id);
		
		this.respuesta += "<br><button type='submit'>Enviar formulario</button></form></body>"
				+ "</html>";
		
		response.getWriter().append(this.respuesta);
		
	}


	private void mostrarCentro(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 			
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id = " + id);
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
// CAMBIAR
				this.respuesta += "<input type='hidden' name='id' value='" + id + "'>" + 
						"Tipo: <input type='text' name='tipo' value='" + rs.getString("tipo") + "'><br/>" +
						"denominacion: <input type='text' name='denominacion' value='" + rs.getString("denominacion") + "'><br/>" +
						"direccion: <input type='text' name='direccion' value='" + rs.getString("direccion") + "'><br/>" +
						"poblacion: <input type='text' name='poblacion' value='" + rs.getString("poblacion") +"'><br/>" +
						"provincia: <input type='text' name='provincia' value='" + rs.getString("provincia") + "'><br/>" ;
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	
	
	
	/**
	 * 
	 */
	private void modificar (int id, String tipo, String denominacion, String direccion, String poblacion, String provincia) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int registrosModificados = s.executeUpdate (
					"update centro_educativo.centro set tipo = '" + tipo + "', denominacion = '" + denominacion + "', direccion = '" + direccion  + "', poblacion = '" + poblacion + "', provincia = '" + provincia + "' where id = " + id);
		   
			if (registrosModificados == 1) {
//				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
//				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
			// Cierre de los elementos
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	
	
}
