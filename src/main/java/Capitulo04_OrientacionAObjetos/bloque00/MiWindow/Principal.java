package Capitulo04_OrientacionAObjetos.bloque00.MiWindow;

import javax.swing.JFrame;

public class Principal extends MiMouseListener {
	
	 	public static void main(String[] args) {
		
		JFrame ventana = new JFrame();
		ventana.setBounds(0, 0, 800, 600);
		
		MiMouseListener mouse = new MiMouseListener();
		ventana.addMouseListener(mouse);
		 
		MiMouseMotionListener mousem = new MiMouseMotionListener();
		ventana.addMouseMotionListener(mousem);
		ventana.setVisible(true);
}		
}
