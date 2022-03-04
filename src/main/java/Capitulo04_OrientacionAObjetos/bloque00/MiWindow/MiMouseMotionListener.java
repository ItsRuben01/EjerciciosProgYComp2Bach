package Capitulo04_OrientacionAObjetos.bloque00.MiWindow;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MiMouseMotionListener extends MouseMotionAdapter{

	@Override
	public void mouseMoved(MouseEvent e) {
		
	System.out.println("Las coordenadas de tu ratón son: " + e.getX() + " " + e.getY());
		
	
	}

}
