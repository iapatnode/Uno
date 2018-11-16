package uno;

import java.util.ArrayList;
/**
 * holds a player's name and hand of Cards.
 * 
 * @author Tommy, Daniel, Jed, Izzy, and Grace
 *
 */
public class Player {
	private ArrayList<Card> hand;//holds the player's cards, starting with 7
	private String name;
	private boolean saidUno;//default & at the end of every turn false, if the player presses the uno button true
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<>();
		saidUno=false;
	}
	/**
	 * asks the player if they want to make a move or draw a card<br>
	 * if they want to make a move, this removes & returns the Card if it can be played on <b>top</b><br>
	 * if they want to draw a card, this should return null
	 * @param top : the current card
	 * @return the card the player chose or null
	 */
	public Card getPlayerMove(Card top) {
		return null;
	}
	/**
	 * adds the card to the player's hand
	 * @param c : the card
	 */
	public void add(Card c) {
		
	}
	public int handSize() {
		return hand.size();
	}
	public String getName() {
		return name;
	}
	public boolean getSaidUno() {
		return saidUno;
	}
	public void setSaidUno(boolean unoSaid) {
		saidUno = unoSaid;
	}
}
