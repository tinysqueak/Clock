import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		ClockFrame clocks = new ClockFrame();
		clocks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clocks.setVisible(true);
		clocks.setLocationRelativeTo(null);
		clocks.setTitle("Clocks");
		
	}

}
