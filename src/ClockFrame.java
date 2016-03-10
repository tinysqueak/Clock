import javax.swing.JFrame;
import java.awt.*;

public class ClockFrame extends JFrame{
	
	private int seconds;
	
	public ClockFrame() {
		
		setSize(700, 600);
		//setBackground(new Color(0x87ceeb));
		repaint();
		
	}
	
	public void paint(Graphics g) {
		
		int targetX = 335 + (int)(125 * Math.cos(Math.toRadians(90 - 6*seconds)));
		int targetX2 = 335 + (int)(50 * Math.cos(Math.toRadians(90 - seconds / 10)));
		
		int targetY = 275 - (int)(125 * Math.sin(Math.toRadians(90 - 6*seconds)));
		int targetY2 = 275 - (int)(50 * Math.sin(Math.toRadians(90 - seconds / 10)));
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		drawBackground(g);
		g.setColor(Color.BLACK);
		g.drawOval(210, 150, 250, 250);
		
		drawMinuteHand(g, targetX, targetY);
		drawHourHand(g, targetX2, targetY2);
		
		seconds++;
		System.out.println(seconds);
		
		repaint();
		
	}
	
	public void drawBackground(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 600);
		
	}
	
	public void drawMinuteHand(Graphics g, int targetX, int targetY) {
		
		g.setColor(Color.BLUE);
		g.drawLine(335, 275, targetX, targetY);
		
	}
	
	public void drawHourHand(Graphics g, int targetX, int targetY) {
		
		g.setColor(Color.GREEN);
		g.drawLine(335, 275, targetX, targetY);
		
	}
	
	
	

}