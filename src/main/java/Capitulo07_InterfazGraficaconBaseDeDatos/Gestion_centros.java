package Capitulo07_InterfazGraficaconBaseDeDatos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Gestion_centros {

	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtftipo;
	private JTextField jtfdeno;
	private JTextField jtfdireccion;
	private JTextField jtflocalidad;
	private JTextField jtfprovincia;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion_centros window = new Gestion_centros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gestion_centros() {
		initialize();
		PrimerCentro();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("GESTIÓN DE CENTROS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(5, 0, 10, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfid = new JTextField();
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 1;
		frame.getContentPane().add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtftipo = new JTextField();
		GridBagConstraints gbc_jtftipo = new GridBagConstraints();
		gbc_jtftipo.insets = new Insets(0, 0, 5, 0);
		gbc_jtftipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtftipo.gridx = 1;
		gbc_jtftipo.gridy = 2;
		frame.getContentPane().add(jtftipo, gbc_jtftipo);
		jtftipo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Denominación:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfdeno = new JTextField();
		GridBagConstraints gbc_jtfdeno = new GridBagConstraints();
		gbc_jtfdeno.insets = new Insets(0, 0, 5, 0);
		gbc_jtfdeno.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfdeno.gridx = 1;
		gbc_jtfdeno.gridy = 3;
		frame.getContentPane().add(jtfdeno, gbc_jtfdeno);
		jtfdeno.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Dirección:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfdireccion = new JTextField();
		GridBagConstraints gbc_jtfdireccion = new GridBagConstraints();
		gbc_jtfdireccion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfdireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfdireccion.gridx = 1;
		gbc_jtfdireccion.gridy = 4;
		frame.getContentPane().add(jtfdireccion, gbc_jtfdireccion);
		jtfdireccion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Localidad:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtflocalidad = new JTextField();
		GridBagConstraints gbc_jtflocalidad = new GridBagConstraints();
		gbc_jtflocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtflocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtflocalidad.gridx = 1;
		gbc_jtflocalidad.gridy = 5;
		frame.getContentPane().add(jtflocalidad, gbc_jtflocalidad);
		jtflocalidad.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Provincia:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		frame.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfprovincia = new JTextField();
		GridBagConstraints gbc_jtfprovincia = new GridBagConstraints();
		gbc_jtfprovincia.insets = new Insets(0, 0, 5, 0);
		gbc_jtfprovincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfprovincia.gridx = 1;
		gbc_jtfprovincia.gridy = 6;
		frame.getContentPane().add(jtfprovincia, gbc_jtfprovincia);
		jtfprovincia.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				PrimerCentro();
			}
			
		});
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				AnteriorCentro();
							
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(">");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SiguienteCentro();
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UltimoCentro();
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoCentro();
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Gestion_centros.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/nuevo.png")));
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardarCentro();
				
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Gestion_centros.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/guardar.png")));
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarCentro();
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Gestion_centros.class.getResource("/tutorialJava/capitulo7_InterfazGrafica/res/eliminar.png")));
		panel.add(btnNewButton_6);
	}
	/**
	 * 	 PRIMER CENTRO
	 */
	private void PrimerCentro() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdeno.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtflocalidad.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));

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
	 *  ULTIMO CENTRO
	 */
	
	private void UltimoCentro() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro order by id desc limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdeno.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtflocalidad.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));

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
	 *  ANTERIOR CENTRO
	 */
	
	private void AnteriorCentro() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id <" + jtfid.getText()+ " order by id desc limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdeno.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtflocalidad.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));

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
	 *  SIGUIENTE CENTRO
	 */

	private void SiguienteCentro() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from centro_educativo.centro where id > " + jtfid.getText()+ " limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtftipo.setText(rs.getString("tipo"));
				jtfdeno.setText(rs.getString("denominacion"));
				jtfdireccion.setText(rs.getString("direccion"));
				jtflocalidad.setText(rs.getString("poblacion"));
				jtfprovincia.setText(rs.getString("provincia"));

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
	 *  ELIMINAR CENTRO
	 */
	private void EliminarCentro() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int rsmod = s.executeUpdate ("DELETE from centro_educativo.centro"+" where id = " + jtfid.getText());
		   
			// Navegación del objeto ResultSet
			if (rsmod == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				PrimerCentro();		
				}
				else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
				}
				s.close();
				conexion.close();
			
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
	 *  GUARDAR CENTRO
	 */
	
	
	private void GuardarCentro() {
		if(jtfid.getText().equals("0")) {
			insertar();		
			}
			else {
			modificar();	
			}

	}
		
	private void insertar() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			int id = siguienteIDdispo();
			int registromod = s.executeUpdate ("Insert into centro_educativo.centro values ("+id+",'"+ jtftipo.getText()+"','" + jtfdeno.getText() +"','" 
					+ jtfdireccion.getText() +"','"+ jtflocalidad.getText() +"','"+ jtfprovincia.getText()+"')");

			
			
			if (registromod == 1) {
			jtfid.setText("" + id);
			JOptionPane.showMessageDialog(null, "Guardado el registro");
					
			}
			else {
			JOptionPane.showMessageDialog(null, "NO se ha guardado el registro");
			}
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
	

private int siguienteIDdispo() {

	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
	   
		Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");
	   
		Statement s = (Statement) conexion.createStatement(); 
		
		ResultSet rs = s.executeQuery ("select max(id) from centro_educativo.centro");
	   
		if (rs.next() == true) { 
			return rs.getInt(1) + 1;
		}
	}
	
	catch (ClassNotFoundException ex) {
		System.out.println("Imposible acceder al driver Mysql");
		ex.printStackTrace();
	}
	catch (SQLException ex) {
		System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		ex.printStackTrace();
	}
return -1;
	
}
	
	private void modificar() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/centro_educativo?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int registromod = s.executeUpdate ("UPDATE centro_educativo.centro set tipo = '" + jtftipo.getText() + "', denominacion = '"+ jtfdeno.getText() +"', direccion = '"+ jtfdireccion.getText() +"', poblacion = '"+ jtflocalidad.getText() +"', provincia = '"+ jtfprovincia.getText() +"' where id = " + jtfid.getText());
			if (registromod == 1) {
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
					
			}
			else {
			JOptionPane.showMessageDialog(null, "Error al ejecutar");
			}
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
	 *  CREAR NUEVO CENTRO	
	 */

		private void NuevoCentro() {
			this.jtfid.setText("0");
			this.jtftipo.setText("");
			this.jtfdeno.setText("");
			this.jtfdireccion.setText("");
			this.jtflocalidad.setText("");
			this.jtfprovincia.setText("");
			
		
		}


}
