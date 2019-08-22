package Pack1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends  JPanel {
	
	static int setWidth  = 600;
	static int setHeight = 500;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		new BackgroundSpeed();
		Background background = new Background();
		RocketMovement movementt  = new RocketMovement();
		RocketMovementSpeeds movementspeed = new RocketMovementSpeeds();
		prizeCarpma prizecarpma = new prizeCarpma();
		ActionHandler handler = new ActionHandler();
		Güncellestirme güncel = new Güncellestirme();
		Healt healt = new Healt();
		Explosion exp = new Explosion();
		tasCarpma carpma = new tasCarpma();
		frame.add(background.btnResume);
		FlameAnimation animationFlame = new FlameAnimation();
		frame.add(movementt);
		frame.add(background);
		background.tasHýzlanma();
		background.prizeAnimation();
		frame.setSize(setWidth,setHeight);
		frame.setTitle("Veys");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	

	}
	
	

}
