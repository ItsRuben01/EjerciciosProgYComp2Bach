package Capitulo04_OrientacionAObjetos.bloque00.EjercicioVentana;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejercici01_ventana {

	public static void main(String[] args) {

	JFrame ventana = new JFrame();
	ventana.setBounds(0,0,800,600);
	ventana.setVisible(true);
		
	ventana.getContentPane().setBackground(Color.decode("#b40bba"));
	//ventana.getContentPane(new BorderLayout());
	JTextField jtf = new JTextField();
	ventana.getContentPane().add(jtf);
	
	}

}
