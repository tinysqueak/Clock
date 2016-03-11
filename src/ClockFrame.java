import javax.swing.JFrame;
import java.awt.*;

public class ClockFrame extends JFrame{
	
	private int seconds;
	
	public ClockFrame() {
		
		setSize(700, 600);
		
	}
	
	public void paint(Graphics g) {
		
		int targetSecondsX = 335 + (int)(125 * Math.cos(Math.toRadians(90 - 6 * seconds)));
		int targetSecondsY = 275 - (int)(125 * Math.sin(Math.toRadians(90 - 6 * seconds)));
		
		int targetMinutesX = 335 + (int)(100 * Math.cos(Math.toRadians(90 - 6 * seconds / 60)));
		int targetMinutesY = 275 - (int)(100 * Math.sin(Math.toRadians(90 - 6 * seconds / 60)));
		
		int targetHoursX = 335 + (int)(50 * Math.cos(Math.toRadians(90 - 30 * seconds / 3600)));
		int targetHoursY = 275 - (int)(50 * Math.sin(Math.toRadians(90 - 30 * seconds / 3600)));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		drawBackground(g);
		g.setColor(Color.BLACK);
		g.drawOval(210, 150, 250, 250);
		
		drawSecondHand(g, targetSecondsX, targetSecondsY);
		drawMinuteHand(g, targetMinutesX, targetMinutesY);
		drawHourHand(g, targetHoursX, targetHoursY);
		
		seconds++;
		System.out.println(seconds);
		
		if(seconds <= 3600)
		repaint();
		
	}
	
	public void drawBackground(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 600);
		
	}
	
	public void drawSecondHand(Graphics g, int targetX, int targetY) {
		
		g.setColor(Color.RED);
		g.drawLine(335, 275, targetX, targetY);
		
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