package Pack1;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class TasMovement extends JPanel{
	
	Main main = new Main();
	
	Timer tasZaman;
	private int temp=0;
	
	public TasMovement(){

		for(int i=0;i<=4;i++){
			Background.tasX[i] = 20+temp;
			Background.tasY[i]=-100-temp;
			temp+=100;
		}
		
		tasZaman = new Timer();
		tasZaman.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
				for(int i=0;i<=4;i++){
					System.out.println("veys");
					Background.tasY[i]+=Background.tasSpeed[i];
					
					if(Background.tasY[i]>=Main.setHeight){
						Background.tasY[i]=-100;
					}
				}
				repaint();
				
				
			}
			}
		}, 0, 150);
	}
	
	

}
