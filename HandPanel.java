import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class HandPanel extends JPanel implements ActionListener {

	private String player;
	private JLabel playerName;

	//tried to make this a parent object with two child objects for each hand. Then I realized I could just use this. So this is the hand panels.

	public HandPanel(String player) {
		super();

		this.player = player;


		playerName = new JLabel(player);
		this.add(playerName);
	}


	public void setPlayer(String player) {
		this.player = player;
	}

	public String player() {
		return this.player;
	}

	public void actionPerformed(ActionEvent ae) {
		
	}
	
}