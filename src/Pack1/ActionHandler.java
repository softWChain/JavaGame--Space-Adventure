package Pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionHandler implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Background.btnResume){
			Background.imSpiel=true;
			Background.btnResume.setVisible(false);
			RocketMovement.tempKeyHandler=0;
			Güncellestirme.tempGüncellestirme=0;

		}
		
	}

}
