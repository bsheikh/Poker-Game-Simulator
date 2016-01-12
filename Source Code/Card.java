/**
 * @author Bilawal Sheikh
 * @StudentNumber: 500563972
 * @ClassType: Card Class
 */

public class Card {
	String suit;
	String rank;

	/**
	 * Constructs a object
	 * @param r rank of the card
	 * @param s suit of the card
	 */
	public Card(String r, String s) {
		rank = r;
		suit = s;
	}

	/**
	 * Returns the rank of the card
	 * @return Rank of the card
	 */
	public String getRanks() {
		return rank;
	}


	/**
 	* Returns the suit of the card
 	* @return Suit of the card
 	*/
	public String getSuits() {
		return suit;
	}
}
