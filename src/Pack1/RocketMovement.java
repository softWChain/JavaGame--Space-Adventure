package Pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class RocketMovement extends JPanel implements KeyListener{
	
	static int deger = 5;
	static int tempKeyHandler=0;

	public RocketMovement() {
		setFocusable(true);
		addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(Background.imSpiel){
		if(e.getKeyCode() == KeyEvent.VK_W){
			Background.moveup = true;

		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			Background.movedown=true;

		}
		
		else if(e.getKeyCode() == KeyEvent.VK_A){
			Background.moveleft=true;
			

		}
		
		else if(e.getKeyCode() == KeyEvent.VK_D){
			Background.moveright=true;

		}
		
		if(tempKeyHandler==0){
			//ButonResume
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE  ){
				Background.imSpiel=false;
				Background.imMenü=true;
				Background.btnResume.setVisible(true);
				
				tempKeyHandler++;
				
				
				
			}
			else if(Background.myHealt<=0){
				
				Background.imSpiel=false;
				Background.imMenü=true;
				Background.btnResume.setVisible(true);
				
				
			}
			else if(tempKeyHandler==1){
				Background.imSpiel=true;
				Background.imMenü=false;
				Background.btnResume.setVisible(false);
				tempKeyHandler--;
				Güncellestirme.tempGüncellestirme=0;
			}
			
		}
		
		
		
		
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(Background.imSpiel){
		if(e.getKeyCode() == KeyEvent.VK_W){
			Background.moveup = false;
		
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			Background.movedown=false;

		}
		
		else if(e.getKeyCode() == KeyEvent.VK_A){
			Background.moveleft=false;

		}
		
		else if(e.getKeyCode() == KeyEvent.VK_D){
			Background.moveright=false;

		}
		
		
		
	}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		

}
