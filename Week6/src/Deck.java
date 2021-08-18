import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  ArrayList<Card> cards = new ArrayList<>();

  Deck() {
    // Instantiates Deck with 52 cards
    for (int i = 0; i < 4; i++) {
      for (int j = 2; j <= 14; j++) {
        Card card = new Card();
        card.setValue(j);
        card.setName(getCardName(getCardNumberName(j), getCardSuit(i)));
        cards.add(card);
      }
    }
  }

  // Gets card suit as String based on loop count
  private String getCardSuit(int cardNumber) {
    String cardSuit = "";

    switch (cardNumber) {
      case 0:
        cardSuit = "Spades";
        break;
      case 1:
        cardSuit = "Clubs";
        break;
      case 2:
        cardSuit = "Hearts";
        break;
      case 3:
        cardSuit = "Diamonds";
        break;
      default:
        System.out.println("Error with card suit!!!");
    }

    return cardSuit;
  }

  // Gets card number as String based on loop count (card number)
  private String getCardNumberName(int cardNumber) {
    String cardName = "";

    switch (cardNumber) {
      case 2:
        cardName = "Two";
        break;
      case 3:
        cardName = "Three";
        break;
      case 4:
        cardName = "Four";
        break;
      case 5:
        cardName = "Five";
        break;
      case 6:
        cardName = "Six";
        break;
      case 7:
        cardName = "Seven";
        break;
      case 8:
        cardName = "Eight";
        break;
      case 9:
        cardName = "Nine";
        break;
      case 10:
        cardName = "Ten";
        break;
      case 11:
        cardName = "Jack";
        break;
      case 12:
        cardName = "Queen";
        break;
      case 13:
        cardName = "King";
        break;
      case 14:
        cardName = "Ace";
        break;
      default:
        System.out.println("Error with card name!!!");
    }

    return cardName;
  }

  private String getCardName(String name, String suit) {
    return name + " of " + suit;
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card draw() {
    return cards.remove(0);
  }

}
