package model;

import java.io.File;
import java.util.ArrayList;


public class FullDeck {
	
	protected ArrayList<Card> cards;
	protected File cardsJson;
	
	public FullDeck(File cardsJson) {
		super();
		this.cardsJson = cardsJson;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public File getCardsJson() {
		return cardsJson;
	}

	public void setCardsJson(File cardsJson) {
		this.cardsJson = cardsJson;
	}
	

	
}
