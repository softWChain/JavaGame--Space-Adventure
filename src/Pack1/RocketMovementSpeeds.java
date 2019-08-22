package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class RocketMovementSpeeds {
	static final int timerTime=10;
	Timer movement;
	
	public RocketMovementSpeeds() {
		
		movement = new Timer();
		
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
				if(Background.moveup==true && Background.rocketY > 0 ){
					
					Background.rocketY-=RocketMovement.deger;
				}
				else if(Background.movedown==true && Background.rocketY<400){
					
					Background.rocketY+=RocketMovement.deger;
				}
				
				else if(Background.moveleft==true && Background.rocketX>0){
					
					Background.rocketX-=RocketMovement.deger;
				}
				else if(Background.moveright==true && Background.rocketX<530){
					
					Background.rocketX+=RocketMovement.deger;
				}
			}
			}
		}, 0, timerTime);
		
		
		
	}

}
