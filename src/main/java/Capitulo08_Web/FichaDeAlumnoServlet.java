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

	/**
 * Servlet implementation class FichaDeAlumnoServlet
 */
@WebServlet("/FichaDeAlumnoServlet")
public class FichaDeAlumnoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	String respuesta;
	
	public FichaDeAlumnoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.respuesta = "<!DOCTYPE html> "
				+ "<html> "
				+ "<head> "
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Insert title here</title> "
				+ "</head> "
				+ "<body> "
				+ "HOLA ";
		
			//System.out.println(request.getParameter("id"));

			MostrarPrimerAlumno(Integer.parseInt(request.getParameter("id")) );
		
		this.respuesta += "</body>"
				+ "</html>";
	
	}
	private void MostrarPrimerAlumno(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id= " + id );
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				this.respuesta += rs.getString("Nombre");
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
}
