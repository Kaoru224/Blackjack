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

	}

	public void paint(Graphics g) {
		Deck deck = new Deck(g);
	}
}