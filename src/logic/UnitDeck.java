package logic;

import java.util.ArrayList;

public class UnitDeck {
	private ArrayList<CardCounter> cardsInDeck;
	private String deckName;

	public UnitDeck(String deckName) {
		setDeckName(deckName);
		this.cardsInDeck = new ArrayList<CardCounter>();
	}

	public void setDeckName(String name) {
		this.deckName = name;
		if (name.isBlank()) {
			this.deckName = "Untitled Deck";
		}
	}

	public String getDeckName() {
		return this.deckName;
	}

	public void setCardsInDeck() {
		return;
	}

	public ArrayList<CardCounter> getCardsInDeck() {
		return this.cardsInDeck;
	}

	public void addCard(UnitCard newCard, int count) {
		if (count <= 0) {
			return;
		}
		for (CardCounter i : this.cardsInDeck) {
			if (i.getCard().equals(newCard)) {
				i.setCount(i.getCount() + count);
				return;
			}
		}
		CardCounter temp = new CardCounter(newCard, count);
		this.cardsInDeck.add(temp);
	}

	public void removeCard(UnitCard toRemove, int count) {
		if (count <= 0) {
			return;
		}
		for (CardCounter i : this.cardsInDeck) {
			if (i.getCard().equals(toRemove)) {
				i.setCount(i.getCount() - count);
				if (i.getCount() == 0) {
					this.cardsInDeck.remove(i);
				}
				return;
			}
		}
	}

	public int cardCount() {
		int count = 0;
		for (CardCounter i : this.cardsInDeck) {
			count += i.getCount();
		}
		return count;
	}

	public boolean existsInDeck(UnitCard card) {
		for (CardCounter i : this.cardsInDeck) {
			if (i.getCard().equals(card) && i.getCount() >= 1) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(UnitDeck other) {
		return this.getDeckName().equals(other.getDeckName());
	}

}
