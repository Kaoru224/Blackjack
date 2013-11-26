import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.util.Random;

public class Deck {

	Random random = new Random();

	//I don't remember making half this stuff
	private int counter;
	private Rectangle r = new Rectangle(0,0,50,75);
	private MoviePoster poster = null;
	private int x;
	private int y;


	//makes the arrays that the program uses to make the cards and the decks and stuff
	public String[] suitArray = {"Hearts","Spades","Diamonds","Clubs"};
	public int[] valueArray = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	public Card[] deck = new Card[52];
	private Card[] unShuffled = new Card[52];
	private int count;

	//import graphics because it prints the deck. Print is optional though.
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
						
						//too lazy to change the name from movie poster
						poster = new MoviePoster(cardName);

						if(x > 1000) {
							x = 0;
							y += 75;
						}

						

						Rectangle a = new Rectangle(x,y,50,75);
						
						poster.draw(g,a);

						x += 50;
						//what was I trying to do here I don't remember
						deck[count] = card;
						count++;
					}
				}
	}

	public void shuffle() {
		int randomCard = 0;
		Card temp = new Card(2,"Hearts");
		//SHUFFLE
		for (int i = 0; i < deck.length;i++ ) {
			randomCard = random.nextInt(52);
			temp = deck[i];
			deck[i] = deck[randomCard];
			deck[randomCard] = temp;
			
		}
	}

	public void printShuffle(Graphics g) {
		int q = 0;
		int z = 250;

		String name = null;
		//basically the same code, just using the shuffled deck
		for (int i = 0; i < deck.length; i++) {
			if (deck[i].cardValue == 1) {
			 	 name = "A" + deck[i].suit;
			} else if (deck[i].cardValue == 11) {
				name = "J" + deck[i].suit;
			} else if (deck[i].cardValue == 12) {
				name = "Q" + deck[i].suit;
			} else if(deck[i].cardValue == 13) {
				name = "K" + deck[i].suit;
			} else {
				name = deck[i].cardValue + deck[i].suit;
			}

			poster = new MoviePoster(name);

			

			if(q > 1000) {
				q = 0;
				z += 75;
			}

			Rectangle b = new Rectangle(q,z,50,75);
			
			poster.draw(g,b);

			q += 50;
		}
	}


	//tried to work out drawing a card. I don't know what I was doing.
	public String giveRandomCard() {
		String nameOfCard = null;
		int w = random.nextInt(52);
			if (deck[w].cardValue == 1) {
		 	 	nameOfCard = "A" + deck[w].suit;
			} else if (deck[w].cardValue == 11) {
				nameOfCard = "J" + deck[w].suit;
			} else if (deck[w].cardValue == 12) {
				nameOfCard = "Q" + deck[w].suit;
			} else if(deck[w].cardValue == 13) {
				nameOfCard = "K" + deck[w].suit;
			} else {
				nameOfCard = deck[w].cardValue + deck[w].suit;
			}

			return nameOfCard;
	}
}