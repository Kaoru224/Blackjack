import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.*;
import java.applet.*;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class run extends Applet {

	public void init() {
		HandPanel dealerHand = new HandPanel("Dealer");
		HandPanel playerHand = new HandPanel("Player");

		this.add(dealerHand);
		this.add(playerHand);
	}

	public void paint(Graphics g) {
		Deck deck = new Deck(g);
		deck.shuffle();
		deck.printShuffle(g);
	}
}