package Capitulo08_Web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Cmd : localhost:8080/EjerciciosProgYComp2Bach/ListadoAlumnosServlet

/**
 * Servlet implementation class ListadoAlumnosServlet
 */
@WebServlet("/ListadoAlumnosServlet")
public class ListadoAlumnosServlet extends HttpServlet {
	
	String respuesta;
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListadoAlumnosServlet() {

 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		for (int i = 0; i < 10; i++) {
			response.getWriter().append(i + (" "));

}
	//PrimerAlumno();
	TodosAlumnos();
	response.getWriter().append(this.respuesta);
	}
	
/**
 *  TODOS LOS ALUMNOS
 */
	
	private void TodosAlumnos() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno");
		   
			// Navegación del objeto ResultSet
			while (rs.next() == true) { 
				this.respuesta += rs.getString("Nombre") + " ";
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
 *   PRIMER ALUMNO/REGISTRO
 */
	
	private void PrimerAlumno() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 1");
		   
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
