package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CarHandler implements KeyListener{
	CarGameGUI GUI;
	int CarSpeed = 20;
	public CarHandler(CarGameGUI g) {
		this.GUI = g;
	}
	@Override
	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		int code = k.getKeyCode();
		int XPos = GUI.CarPanel.getLocation().x;
		int YPos = GUI.CarPanel.getLocation().y;
		if(code == 65) {
			if(!GUI.lost) {
			if(XPos-CarSpeed>200) {
				GUI.CarPanel.setLocation((XPos-CarSpeed), YPos);
			}
			}
		}
		else if(code == 68) {
			if(!GUI.lost) {
			if(XPos+CarSpeed<GUI.width-320) {
				GUI.CarPanel.setLocation((XPos+CarSpeed), YPos);
			}
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}
}
