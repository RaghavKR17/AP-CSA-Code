import java.awt.Color;
import java.awt.Graphics;

public class IceCreamDrawing {
	public static void main(String args[]) {
		DrawingPanel panel = new DrawingPanel(400,500);
		Graphics ice = panel.getGraphics();
		ice.setColor(Color.BLACK);
		ice.fillOval(155, 155, 70, 70);
		ice.setColor(Color.WHITE);
		ice.fillOval(113,170,65,65);
		ice.fillOval(203,170,65,65);
		ice.setColor(Color.BLACK);
		ice.drawOval(113,170,65,65);
		ice.drawOval(203,170,65,65);
		ice.setColor(Color.BLACK);
		ice.fillOval(92, 195, 80, 80);
		ice.fillOval(208, 195, 80, 80);
		ice.setColor(Color.WHITE);
		ice.fillOval(109,225,75,75);
		ice.fillOval(190,225,80,80);
		ice.setColor(Color.BLACK);
		ice.drawOval(109,225,75,75);
		ice.drawOval(190,225,80,80);
		ice.fillOval(150, 227, 80, 80);
		int [] x = { 110 , 190, 270, 190 }; 
		int [] y = { 270, 300, 270, 450}; 
		ice.setColor(Color.WHITE);
		ice.fillPolygon( x, y, 4 );
		ice.setColor(Color.BLACK);
		ice.drawPolygon( x, y, 4 ); 
		ice.drawLine(190,300,131,320);
		int [] a = {175, 225, 272, 221};
		int [] b = {205, 105, 129, 230 };
		ice.fillPolygon(a,b,4);
		ice.setColor(Color.WHITE);
		ice.drawPolygon(a,b,4);
		ice.drawLine(216,126,260,149);
		ice.drawLine(205, 145, 251, 168);
		ice.drawLine(196,164,241,188);
		ice.drawLine(185,183,231,207);
		ice.drawLine(249,117,199,217);
		
	}
}
 