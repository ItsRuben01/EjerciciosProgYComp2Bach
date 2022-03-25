package capitulo06_Acceso_a_datos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Ejemplo01_ConexionBasica {

	/**
	 * 
	 */
	private static void pruebaInsert () {
		int id;
		String NuevoNombre;
		String NuevoApellido;
		String NuevoNif;
		Scanner sc = new Scanner (System.in);
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// Cambiamos los datos
			System.out.println("Introduce el id del registro afectado: ");
			id = Integer.parseInt(sc.next());
			System.out.println("Introduce el nuevo nombre del registro : ");
			NuevoNombre = sc.next();
			System.out.println("Introduce el nuevo apellido del registro : ");
			NuevoApellido = sc.next();
			System.out.println("Introduce el nuevo NIF del registro : ");
			NuevoNif = sc.next();
			
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			int numeroderegistrosafectados = s.executeUpdate("INSERT INTO alumnos.alumnoVALUES (" + id + "," + "'" + NuevoNombre 
					+ "','" + NuevoApellido + "','" + NuevoNif + "')" );
		   
			System.out.println(numeroderegistrosafectados + "registros afectados");
			
			// Navegación del objeto ResultSet
			
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
	
	private static void pruebaUpdate () {
		int id;
		String NuevoNombre;
		String NuevoApellido;
		String NuevoNif;
		Scanner sc = new Scanner (System.in);
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// Cambiamos los datos
			System.out.println("Introduce el id del registro afectado: ");
			id = Integer.parseInt(sc.next());
			System.out.println("Introduce el nuevo nombre del registro : ");
			NuevoNombre = sc.next();
			System.out.println("Introduce el nuevo apellido del registro : ");
			NuevoApellido = sc.next();
			System.out.println("Introduce el nuevo NIF del registro : ");
			NuevoNif = sc.next();
			
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			int numeroderegistrosafectados = s.executeUpdate("UPDATE alumnos.alumno set nombre = '" + NuevoNombre +"', apellidos ='" + NuevoApellido + ", nif =' " + NuevoNif + "' where id= " + id + ";");
		   
			System.out.println(numeroderegistrosafectados + "registros afectados");
			
			// Navegación del objeto ResultSet
			
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
	
	
	/**
	 * 
	 *  PRUEBA CONSULTA BÁSICA
	 */

	/**
	 * 
	 */
	private static void pruebaConsultaBasica () {
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno");
		   
			// Navegación del objeto ResultSet
			while (rs.next() == true) { 
				System.out.println("id: " + rs.getInt("id") + " - nombre: " +
						rs.getString("nombre") + " - apellidos: " + 
						rs.getString("apellidos") + " - nif: " + 
						rs.getString("nif"));
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
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		pruebaInsert();
	}

}
