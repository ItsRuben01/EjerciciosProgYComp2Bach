package Capitulo04_OrientacionAObjetos.bloque00.EjercicioVentana;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejercici01_ventana {

	public static void main(String[] args) {

	JFrame ventana = new JFrame();
	ventana.setBounds(0,0,800,600);
		
	//ventana.getContentPane().setBackground(Color.decode("#ffa600"));
	ventana.getContentPane().setLayout(new BorderLayout());
    ventana.setMinimumSize(new Dimension(400, 400));
    
    Canvas MiPropioCanvas = new Canvas();
    
	JCheckBox Check1 = new JCheckBox();
	ventana.getContentPane().add(Check1, BorderLayout.WEST);
	
	
	ventana.setVisible(true);
	
	}

}
