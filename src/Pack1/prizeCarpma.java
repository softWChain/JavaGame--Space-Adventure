package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class prizeCarpma {

	Timer prizeCarpma;
	private int temp=0;
	public prizeCarpma() {
		
		prizeCarpma = new Timer();
		
		prizeCarpma.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Background.imSpiel){
				for(int i=0;i<=4;i++){
					
					if(Background.rocketX >= Background.prizeX[i]-50 && Background.rocketX <= Background.prizeX[i]+30&& 
							Background.rocketY >= Background.prizeY[i]-60 && Background.rocketY <= Background.prizeY[i]+40){
					
						Background.prizeY[i]=-150;
						
						Background.myHealt=Background.myHealt+40;
						
						if(Background.myHealt>800){
							
							Background.myHealt = Background.myHealt +100;
							
						}
						
			
					}
				}

			}
			}
			
		}, 0, 10);
	}

}
