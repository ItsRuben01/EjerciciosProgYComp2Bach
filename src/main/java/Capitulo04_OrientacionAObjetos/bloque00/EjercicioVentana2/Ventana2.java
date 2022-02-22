package Capitulo04_OrientacionAObjetos.bloque00.EjercicioVentana2;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class Ventana2 {

	public static void main(String[] args) {

	JFrame ventana = new JFrame();
	
	ventana.setBounds(0,0,800,600);
	ventana.getContentPane().setLayout(new BorderLayout());
	MiPropioCanvas canvas = new MiPropioCanvas();
	canvas.setBackground(Color.PINK);
	ventana.getContentPane().add(canvas, BorderLayout.CENTER);
	
	ventana.setVisible(true);
	
	}
}
