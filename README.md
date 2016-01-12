## Poker Game Simulator

### Objective

Implement a simulation of a popular casino game usually called video poker. The card deck contains 52 cards, 13 of each suit. At the beginning of the game, the deck is shuffled. Then the top five cards of the deck are presented to the player. The player can reject none, some, or all of the cards. The rejected cards are replaced from the top of the deck, so that the player has again five cards. The rejected cards can go in a discard pile so that they are not re-used until a new deck is initiated and shuffled, which would occur when the current deck is empty, or if you prefer, you can start with a new shuffled deck at the beginning of each new hand. Now the hand is scored. (After scoring the hand, the hand can go on the discard pile, along with the rejected cards). Your program should pronounce the hand to be one of the following:

* No pair: The lowest hand, containing five separate cards that do not match up to create any of the hands below.

* One pair: Two cards of the same value, for example two queens.

* Two pairs: Two pairs, for example two queens and two 5's.

* Three of a kind: Three cards of the same value, for example three queens.

* Straight: Five cards with consecutive values, not necessarily of the same suit, such as 4, 5, 6, 7, and 8. The ace can either precede a 2 or follow a king.

* Flush: Five cards, not necessarily in order, of the same suit.

* Full House: Three of a kind and a pair, for example three queens and two 5's

* Four of a Kind: Four cards of the same value, such as four queens.

* Straight Flush: A straight and a flush: Five cards with consecutive values of the same suit

* Royal Flush: The best possible hand in poker. A 10, jack, queen, king, and ace, all of the same suit.

Implement a wager system.