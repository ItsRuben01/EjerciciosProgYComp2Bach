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
 * cmd : localhost:8080/EjerciciosProgYComp2Bach/ListadoDeCentroServlet
 */
@WebServlet("/ListadoDeCentroServlet")
public class ListadoDeCentroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String respuesta = "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.respuesta += "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\">"
				+ "<title>Listado De Centros</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>Listado de centros</h1>"
				+ "<table width='100%' border='1'>";
				
		

		//PrimerAlumno();
		TodosCentros();
		this.respuesta += "</table></body>"
		+ "</html>";
		
		
		response.getWriter().append(this.respuesta);
		
		}
		
	/**
	 *  TODOS LOS ALUMNOS
	 */
		
		private void TodosCentros() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

				Statement s = (Statement) conexion.createStatement(); 
				
				ResultSet rs = s.executeQuery ("select * from centro_educativo.centro");
			   
				// Navegación del objeto ResultSet
				while (rs.next() == true) { 
					this.respuesta +="<tr>" +
							"<td><a href='FichaDeCentroServlet?id=" + rs.getInt("id") + "'>" + rs.getString("denominacion") + "</a></td>" +
							"<td>" + rs.getString("direccion") + "</td>" +
							"<td>" + rs.getString("poblacion") + "</td>" + 
							"<td>" + rs.getString("provincia") + "</td>" +
							"</tr>";
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
		
		private void PrimerCentro() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

				Statement s = (Statement) conexion.createStatement(); 
				
				ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id limit 1");
			   
				// Navegación del objeto ResultSet
				if (rs.next() == true) { 
					this.respuesta += "<tr>" +
							"<td><a href='PrimerCentroServlet?id=" + rs.getInt("id") + "'>" + rs.getString("denominacion") + "</a></td>";
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
		