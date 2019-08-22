package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class tasCarpma {

	Timer carpma;
	private int temp=0;
	public tasCarpma() {

		carpma = new Timer();
		carpma.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
				for(int i=0;i<=4;i++){
					
					if(temp==0){
						if(Background.rocketX>=Background.tasX[i]-30 && Background.rocketX<=Background.tasX[i]+30 &&
								Background.rocketY>=Background.tasY[i]-30&&Background.rocketY<=Background.tasY[i]+30){
							
							Background.carpma = true;
							Background.tasY[i]=-100;
							
							if(Background.canlý>=1){
								Background.canlý-=1;
								
							}
							if(Background.canlý==0){
								Background.kayýp=true;
		
							}
							else if(Background.canlý>0){
								Background.kayýp=false;
							}
							temp++;
						}
							
					}		
				}
				
				if(temp>=1&&temp<=65){
					temp++;
				}
				else if(temp==66){
					temp=0;
				}
				
				
			}
			}
		}, 0, 15);
	}
}
