import java.awt.*;

public class NameDrawing {
	public static void main(String args[]) {
		DrawingPanel panel = new DrawingPanel(600,150);
		Graphics name = panel.getGraphics();
		name.drawLine(100,10,100,100);
		name.drawLine(100, 10, 150, 40);
		name.drawLine(150, 40, 100, 60);
		name.drawLine(150, 40, 100, 60);
		name.drawLine(100, 60, 140,100);
		name.drawLine(150, 100, 185, 10);
		name.drawLine(185, 10, 220, 100);
		name.drawLine(165, 60, 205, 60);
		name.drawLine(230, 10, 280, 10);
		name.drawLine(230, 10, 230, 100);
		name.drawLine(230, 100, 290, 100);
		name.drawLine(290, 100, 290, 60);
		name.drawLine(290,60,260,60);
		name.drawLine(320, 10, 320, 100);
		name.drawLine(320, 50, 370, 50);
		name.drawLine(370,10,370,100);
		name.drawLine(390, 100, 425, 10);
		name.drawLine(425,10,460,100);
		name.drawLine(407, 60, 444, 60);
		name.drawLine(470, 10, 500, 100);
		name.drawLine(500, 100, 530, 10);

	}
}
 