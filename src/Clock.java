
public class Clock{

	private int centerX;
	private int centerY;
	private int radius;
	
	private int startingHour;
	private int startingMinute;
	private int startingSecond;

	public Clock(int x, int y, int radius, int startingHour, int startingMinute, int startingSecond) {

		this.centerX = x;
		this.centerY = y;
		this.radius = radius;
		
		this.startingHour = startingHour;
		this.startingMinute = startingMinute;
		this.startingSecond = startingSecond;

	}

	public int getCenterX() {

		return centerX;

	}
	
	public void setCenterX(int x) {
		
		centerX = x;
		
	}

	public int getCenterY() {

		return centerY;

	}
	
	public void setCenterY(int y) {
		
		centerY = y;
		
	}
	
	public int getRadius() {
		
		return radius;
		
	}
	
	public void setRadius(int radius) {
		
		this.radius = radius;
		
	}
	
	public int getStartingHour() {
		
		return startingHour;
		
	}
	
	public void setStartingHour(int hour) {
		
		startingHour = hour;
		
	}
	
	public int getStartingMinute() {
		
		return startingMinute;
		
	}
	
	public void setStartingMinute(int minute) {
		
		startingMinute = minute;
		
	}
	
	public int getStartingSecond() {
		
		return startingSecond;
		
	}
	
	public void setStartingSecond(int second) {
		
		startingSecond = second;
		
	}

}
