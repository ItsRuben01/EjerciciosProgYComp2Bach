package Capitulo04_OrientacionAObjetos.bloque00.EjercicioVentana2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiPropioCanvas extends Canvas{

	public void paint(Graphics g) {
		super.paint(g);
		
		// Rectángulos !!
		
		g.setColor(Color.BLACK);
		g.fillRect(100, 150, 100, 75);
		
		g.setColor(Color.CYAN);
		g.fillRect(200, 250, 200, 175);
		
		// Círculos
		
		g.setColor(Color.GRAY);
		g.fillOval(WIDTH/2, HEIGHT/2, 200, 300);
		
		g.setColor(Color.BLUE);
		g.fillOval(WIDTH/2, HEIGHT/2, 400, 150);
		
		// Poligonos
		
		int x[] = new int []  {300,200,400,500};
		int y[] = new int []  {250,310,350,200};
		g.fillPolygon(x, y, 4);
		

		int t[] = new int []  {200,350,120,240};
		int u[] = new int []  {100,50,200,180};
		g.fillPolygon(u, t, 4);
	}


}
