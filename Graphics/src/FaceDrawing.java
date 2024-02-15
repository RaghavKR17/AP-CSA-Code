import java.awt.*;
public class FaceDrawing {



public static void main(String[] args) {
DrawingPanel panel = new DrawingPanel(300,300);
Graphics g = panel.getGraphics();
g.setColor(Color.YELLOW);
g.fillOval(75, 40, 150, 150);
g.setColor(Color.RED);
g.drawArc(100, 68, 100, 100, -26, -120);
g.setColor(Color.CYAN);
g.fillOval(115, 78, 20, 20);
g.fillOval(165, 78, 20, 20);
}



}