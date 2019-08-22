package Pack1;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class Güncellestirme extends JPanel{

	Timer güncellestirme;
	static int tempGüncellestirme=0;
	
	public Güncellestirme() {

		güncellestirme = new Timer();
		
		güncellestirme.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
					if(Background.imMenü){
						
						if(tempGüncellestirme==0){
							
							Background.btnResume.requestFocus();
							
							tempGüncellestirme++;
							
						}
						else if(tempGüncellestirme==1){
							
							
						}
						
					}
					
					
				}
			}
		}, 0, 50);
	}

}
