
//oh god so much import

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.*;
import java.applet.*;
import java.util.Random;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class run extends Applet {

	public void init() {
	
	//blank cause science

	}

	public void paint(Graphics g) {

		//makes/prints deck
		Deck deck = new Deck(g);
		deck.shuffle();
		deck.printShuffle(g);


		//panels, import names so I could label them in testing.
		HandPanel dealerHand = new HandPanel("Dealer");
		HandPanel playerHand = new HandPanel("Player");


		this.add(dealerHand);
		this.add(playerHand);

		//this didn't work.
		String name = deck.giveRandomCard();
		JLabel test = new JLabel(name);
		dealerHand.add(test);
		this.add(test);


		//causes all sorts of fun glitches
		repaint();

		
	}
}