package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BackgroundSpeed{
	
	static int timerSpeed=10;
	Timer speed;
	public BackgroundSpeed() {
		
		speed = new Timer();
		speed.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Background.imSpiel){
				
				if(Background.backgroundY1<496){
					Background.backgroundY1+=2;
					
				}
				else{
					
					Background.backgroundY1=-500;
				}
				
				if(Background.backgroundY2<496){
					Background.backgroundY2+=2;
					
				}
				else{
					
					Background.backgroundY2=-500;
				}
				
				
			}
				
			}
			
		}, 0, timerSpeed);
	}

}
