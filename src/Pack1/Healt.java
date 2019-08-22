package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Healt {

	private int temp=0;
	Timer healtTimer;
	public Healt() {
		
		healtTimer =  new Timer();
		
		healtTimer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
				if(Background.carpma==true){

					if(Background.explosionAnimation==0){
						Background.myHealt = Background.myHealt -80;
						
						if(Background.myHealt>800){
							
							Background.myHealt = Background.myHealt -200;
							
						}


					}	
				}
				
			}
			}
		}, 0, 50);
		
	}
}
