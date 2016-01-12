import java.util.*;

/**
 * @author Bilawal Sheikh
 * @StudentNumber: 500563972
 * @ClassType: PokerTester Class
 */

public class PokerTester {
	
	//Initialize Variables/Objects
	ArrayList<Card> hand = new ArrayList<Card>();
	//Card card = new Card("", "");
	Card card;
	ArrayList<Card> deckOfCards = new ArrayList<Card>();
	Points testPoints;
	Deck deckTester;
	
	//Suits
	String hearts = "Hearts";
	String clubs = "Clubs";
	String spades = "Spades";
	String diamonds = "Diamonds";
	//Ranks
	String queen = "Queen";
	String king = "King";
	String jack = "Jack";
	String ace = "Ace";
	//Possible Suits
	String[] suits = {hearts,hearts,hearts,hearts,hearts,
			clubs,clubs,clubs,clubs,clubs,
			hearts, clubs, diamonds, spades, hearts,
			hearts, diamonds, clubs, hearts, diamonds,
			diamonds, diamonds, diamonds, diamonds, diamonds,
			hearts, diamonds, spades, clubs, clubs,
			spades, hearts, clubs, diamonds, clubs,
			diamonds, hearts, diamonds, hearts, hearts,
			hearts, diamonds, diamonds, clubs, spades,
			hearts, clubs, diamonds, clubs, spades};
	//Possible Ranks
	String[] ranks = {ace, "10", jack, queen, king,
			"2", "3", "4", "5", "6",
			"9", "9", "9", "9", "4",
			queen, queen, queen, "5", "5",
			"4", "6", "8", "2", "9",
			"4", "5", "6", "7", "8",
			"4", "4", "4", "7", "6",
			"5", "5", jack, jack, king,
			jack, jack, "4", "6", "8",
			jack, "4", "9", "8", "6"};
	
	/**
	 * Constructor. Note: Does not construct anything
	 */
	public PokerTester() {
	
	}
	
	/**
	 * Test's the different type of hands and prints out the value which is compared to the Expected value. Eg. Royal Flush, Straight etc...
	 * Also prints the shuffled/Un-shuffled deck
	 */
	public void testObjects() {
		
		deckTester = new Deck(ranks, suits);
		deckTester.createDeckTester();
		
		//Royal Flush
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Royal Flush");
		System.out.println("Amount won: 250 Java Dollars");
		
		//Straight Flush
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Straight Flush");
		System.out.println("Amount won: 50 Java Dollars");
		
		//Four of a Kind
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Four of a Kind");
		System.out.println("Amount won: 25 Java Dollars");
		
		//Full House
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Full House");
		System.out.println("Amount won: 6 Java Dollars");
		
		//Flush
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Flush");
		System.out.println("Amount won: 5 Java Dollars");
		
		//Straight
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Straight");
		System.out.println("Amount won: 4 Java Dollars");
		
		//Three of a Kind
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Three of a kind");
		System.out.println("Amount won: 3 Java Dollars");
		
		//Two Pairs
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: Two Pairs");
		System.out.println("Amount won: 2 Java Dollars");
		
		//One Pair
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: One Pair");
		System.out.println("Amount won: 1 Java Dollars");
		
		//No Pairs
		hand = deckTester.dealHand();
		printHand();
		getValues();
		System.out.println("Expected:");
		System.out.println("Type of Hand: No Pairs");
		System.out.println("Amount won: 0 Java Dollars");
		
		//Print Un-Shuffled Deck
		deckTester = new Deck();
		deckTester.createDeck();
		deckOfCards = deckTester.printDeck();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Deck of cards Un-shuffled: ");
		System.out.println();
		for (int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).getRanks() + " " + deckOfCards.get(i).getSuits());
		}
		
		//Print Shuffled Deck
		deckTester.shuffleDeck();
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Deck of cards Shuffled: ");
		System.out.println();
		for (int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).getRanks() + " " + deckOfCards.get(i).getSuits());
		}
	}
	
	
	/**
	 * Gets the amount of java dollars won and the type of hand the user had. NOTE: Calling this method makes the code shorter as this is not a new method. 
	 */
	public void getValues() {
		System.out.println();
		testPoints = new Points(hand);
		testPoints.givePoints();
		System.out.println("Type of Hand: " + testPoints.getTypeOfHandValue());
		System.out.println("Amount won: " + testPoints.getAmountOfJavaDollars() + " Java Dollars");
	}
	
	/**
	 * Prints the 5 cards the user has. NOTE: Calling this method makes the code shorter as this is not a new method. 
	 */
	public void printHand() {
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Cards: ");
		for (int i = 0; i < hand.size(); i++)
			System.out.println(hand.get(i).getRanks() + " " + hand.get(i).getSuits());
	}
}
