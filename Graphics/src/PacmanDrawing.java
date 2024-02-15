import java.awt.*;
public class PacmanDrawing {
	
public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(600,600);
	Graphics g = panel.getGraphics();
	g.setColor(Color.WHITE);
	g.fillOval(45, 65, 150, 150);
	g.setColor(Color.BLACK);
	g.drawOval(45, 65, 150, 150);
	g.setColor(Color.WHITE);
	int [] x = { 145 , 197, 203,}; 
	int [] y = { 135, 95, 160,}; 
	g.fillPolygon(x,y,3);
	g.setColor(Color.BLACK);
	g.drawLine(145,135,185,102);
	g.drawLine(145,135,193,156);
	g.setColor(Color.RED);
	g.fillOval(100,90,20,20);
	
	}

}