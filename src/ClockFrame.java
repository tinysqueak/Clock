import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;

public class ClockFrame extends JFrame{

	private int seconds;
	private ArrayList<Clock> clockList;

	public ClockFrame() {

		setSize(700, 600);
		clockList = new ArrayList<Clock>();

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

		for(Clock clock : clockList) {

			drawClock(g, clock);

		}

		drawSecondClock(g, targetSecondsX, targetSecondsY);
		drawSecondHand(g, 335, 275, targetSecondsX, targetSecondsY);
		drawMinuteHand(g, 335, 275, targetMinutesX, targetMinutesY);
		drawHourHand(g, 335, 275, targetHoursX, targetHoursY);

		seconds++;
		System.out.println(seconds);

		repaint();

	}

	public void drawBackground(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 600);

	}

	public void drawSecondHand(Graphics g, int startX, int startY, int targetX, int targetY) {

		g.setColor(Color.RED);
		g.drawLine(startX, startY, targetX, targetY);

	}

	public void drawMinuteHand(Graphics g, int startX, int startY, int targetX, int targetY) {

		g.setColor(Color.BLUE);
		g.drawLine(startX, startY, targetX, targetY);

	}

	public void drawHourHand(Graphics g, int startX, int startY, int targetX, int targetY) {

		g.setColor(Color.GREEN);
		g.drawLine(startX, startY, targetX, targetY);

	}

	public void drawSecondClock(Graphics g, int targetX, int targetY) {

		g.setColor(Color.BLACK);
		g.drawOval(targetX - 25, targetY - 25, 50, 50);

		int targetSecondsX = targetX + (int)(25 * Math.cos(Math.toRadians(90 - 6 * seconds)));
		int targetSecondsY = targetY - (int)(25 * Math.sin(Math.toRadians(90 - 6 * seconds)));

		int targetMinutesX = targetX + (int)(20 * Math.cos(Math.toRadians(90 - 6 * seconds / 60)));
		int targetMinutesY = targetY - (int)(20 * Math.sin(Math.toRadians(90 - 6 * seconds / 60)));

		int targetHoursX = targetX + (int)(10 * Math.cos(Math.toRadians(90 - 30 * seconds / 3600)));
		int targetHoursY = targetY - (int)(10 * Math.sin(Math.toRadians(90 - 30 * seconds / 3600)));

		drawSecondHand(g, targetX, targetY, targetSecondsX, targetSecondsY);
		drawMinuteHand(g, targetX, targetY, targetMinutesX, targetMinutesY);
		drawHourHand(g, targetX, targetY, targetHoursX, targetHoursY);

	}

	public void drawClock(Graphics g, Clock clock) {

		g.setColor(Color.BLACK);
		g.drawOval(clock.getCenterX() - clock.getRadius(), clock.getCenterY() - clock.getRadius(), clock.getRadius() * 2, clock.getRadius() * 2);

		int startingSecondsAngle = 90 - clock.getStartingSecond() * 6;
		int startingMinutesAngle = 90 - clock.getStartingMinute() * 6 - 6 * clock.getStartingSecond() / 60;
		int startingHoursAngle = 90 - clock.getStartingHour() * 30 - 30 * clock.getStartingSecond() / 3600 - 30 * clock.getStartingMinute() / 60;

		int targetSecondsX = clock.getCenterX() + (int)(clock.getRadius() * Math.cos(Math.toRadians(startingSecondsAngle - 6 * seconds)));
		int targetSecondsY = clock.getCenterY() - (int)(clock.getRadius() * Math.sin(Math.toRadians(startingSecondsAngle - 6 * seconds)));

		int targetMinutesX = clock.getCenterX() + (int)(4 * clock.getRadius() / 5 * Math.cos(Math.toRadians(startingMinutesAngle - 6 * seconds / 60)));
		int targetMinutesY = clock.getCenterY() - (int)(4 * clock.getRadius() / 5 * Math.sin(Math.toRadians(startingMinutesAngle - 6 * seconds / 60)));

		int targetHoursX = clock.getCenterX() + (int)(2 * clock.getRadius() / 5 * Math.cos(Math.toRadians(startingHoursAngle - 30 * seconds / 3600)));
		int targetHoursY = clock.getCenterY() - (int)(2 * clock.getRadius() / 5 * Math.sin(Math.toRadians(startingHoursAngle - 30 * seconds / 3600)));

		drawSecondHand(g, clock.getCenterX(), clock.getCenterY(), targetSecondsX, targetSecondsY);
		drawMinuteHand(g, clock.getCenterX(), clock.getCenterY(), targetMinutesX, targetMinutesY);
		drawHourHand(g, clock.getCenterX(), clock.getCenterY(), targetHoursX, targetHoursY);

	}

	public void addClock(Clock clock) {

		clockList.add(clock);

	}

}
