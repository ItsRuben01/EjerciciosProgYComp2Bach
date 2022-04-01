package Capitulo07_InterfazGráficaconBaseDeDatos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class GestiónAlumnos {

	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtfnombre;
	private JTextField jtfapellidos;
	private JTextField jtfnif;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestiónAlumnos window = new GestiónAlumnos();
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
	public GestiónAlumnos() {
		initialize();
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestión de Alumnos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(15, 0, 5, 0);
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
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfnombre = new JTextField();
		GridBagConstraints gbc_jtfnombre = new GridBagConstraints();
		gbc_jtfnombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnombre.gridx = 1;
		gbc_jtfnombre.gridy = 2;
		frame.getContentPane().add(jtfnombre, gbc_jtfnombre);
		jtfnombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfapellidos = new JTextField();
		GridBagConstraints gbc_jtfapellidos = new GridBagConstraints();
		gbc_jtfapellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfapellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfapellidos.gridx = 1;
		gbc_jtfapellidos.gridy = 3;
		frame.getContentPane().add(jtfapellidos, gbc_jtfapellidos);
		jtfapellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NIF:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfnif = new JTextField();
		GridBagConstraints gbc_jtfnif = new GridBagConstraints();
		gbc_jtfnif.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnif.gridx = 1;
		gbc_jtfnif.gridy = 4;
		frame.getContentPane().add(jtfnif, gbc_jtfnif);
		jtfnif.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarprimeralumno();
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostraranterioralumno();
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(">");
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarultialumno();
			}
		});
		panel.add(btnNewButton_3);
	}
	/**
	 *  Metodo Primer alumno
	 */
	
private void mostrarprimeralumno() {
	
		try {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 1");
		   
			if (rs.next() == true) { 
				jtfid.setText(rs.getString("id"));
				jtfnombre.setText(rs.getString("Nombre"));
				jtfapellidos.setText(rs.getString("Apellidos"));
				jtfnif.setText(rs.getString("NIF"));
				}
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
 *  Metodo ultimo alumno
 */
private void mostrarultialumno() {
	
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
	   
		Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
	   
		Statement s = (Statement) conexion.createStatement(); 
		
		ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id desc limit 1");
	   
		if (rs.next() == true) { 
			jtfid.setText(rs.getString("id"));
			jtfnombre.setText(rs.getString("Nombre"));
			jtfapellidos.setText(rs.getString("Apellidos"));
			jtfnif.setText(rs.getString("NIF"));
			}
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
 *  Metodo anterior alumno 
 */

private void mostraranterioralumno(int idactual) {

	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
	   
		Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
	   
		Statement s = (Statement) conexion.createStatement(); 
		
		ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by where id >"+ idactual + "limit 1");
	   
		if (rs.next() == true) { 
			jtfid.setText(rs.getString("id"));
			jtfnombre.setText(rs.getString("Nombre"));
			jtfapellidos.setText(rs.getString("Apellidos"));
			jtfnif.setText(rs.getString("NIF"));
			}
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



