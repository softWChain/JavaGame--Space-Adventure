package Pack1;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class G�ncellestirme extends JPanel{

	Timer g�ncellestirme;
	static int tempG�ncellestirme=0;
	
	public G�ncellestirme() {

		g�ncellestirme = new Timer();
		
		g�ncellestirme.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
					if(Background.imMen�){
						
						if(tempG�ncellestirme==0){
							
							Background.btnResume.requestFocus();
							
							tempG�ncellestirme++;
							
						}
						else if(tempG�ncellestirme==1){
							
							
						}
						
					}
					
					
				}
			}
		}, 0, 50);
	}

}
