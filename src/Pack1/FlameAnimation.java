package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class FlameAnimation {
	Timer flame;
	private int temp=0;
	private final int Timertime = 150;
	
	public FlameAnimation() {
		
		flame = new Timer();
		
		flame.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
				if(temp==0){
					Background.flameAnimation=0;
					temp++;
				}
				else if(temp==1){
					Background.flameAnimation=1;
					temp--;
				}
				
				
			}
			}
		}, 0, Timertime);
		
	}

}
