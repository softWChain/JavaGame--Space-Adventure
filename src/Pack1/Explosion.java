package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Explosion {
	Timer explosion;
	private int temp = 0;
	public Explosion() {
		
		explosion = new Timer();
		explosion.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
				if(Background.carpma==true){
					
					if(temp<15){
						Background.explosionAnimation=temp;
						temp++;
					}
					else if(temp==15){
						
						Background.explosionAnimation=15;
						temp=0;
						Background.carpma=false;
					}
				}
				
			}
			}
		}, 0, 50);
		
	}

}
