import java.util.ArrayList;

public class Player {
  ArrayList<Card> hand = new ArrayList<>();
  int score;
  String name;

  Player(String name) {
    score = 0;
    this.name = name;
  }

  public void describe() {
    System.out.println(name);
    for (Card card : hand) {
      card.describe();
    }
  }

  public Card flip() {
    return hand.remove(0);
  }

  public void draw(Deck deck) {
    hand.add(deck.draw());
  }

  public void incrementScore() {
    score++;
  }

  public int getFinalScore() {
    return score;
  }
}
