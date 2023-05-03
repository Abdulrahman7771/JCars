package Game;

import java.awt.EventQueue;

public class Player {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarGameGUI window = new CarGameGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
}
