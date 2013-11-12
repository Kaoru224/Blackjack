import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Deck {

	private int counter;
	private Rectangle r = new Rectangle(0,0,100,150);
	private MoviePoster poster;
	private int x;
	private int y;



	private String[] suitArray = {"Hearts","Spades","Diamonds","Clubs"};
	private int[] valueArray = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private Card[] deck = new Card[51];
	private int count;

	public Deck(Graphics g) {
				String cardName = "";

				for (int i = 0; i < suitArray.length; i++) {
					for (int j = 0; j < valueArray.length; j++) {
						Card card = new Card(valueArray[j],suitArray[i]);
						if (valueArray[j] == 1) {
		 				 	cardName = "A" + suitArray[i];
						} else if (valueArray[j] == 11) {
							cardName = "J" + suitArray[i];
						} else if (valueArray[j] == 12) {
							cardName = "Q" + suitArray[i];
						} else if(valueArray[j] == 13) {
							cardName = "K" + suitArray[i];
						} else {
							cardName = valueArray[j] + suitArray[i];
						}
						

						poster = new MoviePoster(cardName);

						

						if(x > 1000) {
							x = 0;
							y += 125;
						}

						x += 100;

						Rectangle a = new Rectangle(x,y,100,150);
						
						poster.draw(g,a);

					}
				}
	}



	// public void makeCards() {
			
		// String cardName = "";

		// for (int i = 0; i < suitArray.length; i++) {
		// 	for (int j = 0; j < valueArray.length; j++) {
		// 		Card card = new Card(valueArray[j],suitArray[i]);
		// 		if (valueArray[j] == 1) {
 	// 			 	cardName = "A" + suitArray[i];
		// 		} else if (valueArray[j] == 11) {
		// 			cardName = "J" + suitArray[i];
		// 		} else if (valueArray[j] == 12) {
		// 			cardName = "Q" + suitArray[i];
		// 		} else if(valueArray[j] == 13) {
		// 			cardName = "K" + suitArray[i];
		// 		} else {
		// 			cardName = valueArray[j] + suitArray[i];
		// 		}
				
		// 		poster = new MoviePoster(cardName);
		// 		poster.draw(g,r);

		// 	}
		// }
	// }
}