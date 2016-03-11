
public class Clock{

	private int centerX;
	private int centerY;
	private int radius;

	public Clock(int x, int y, int radius) {

		this.centerX = x;
		this.centerY = y;
		this.radius = radius;

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

}
