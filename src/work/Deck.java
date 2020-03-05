public class Deck {
  private ArrayList<Card> deck;

  public Deck() {
    deck = new ArrayList<>();
    for (String rank: Card.RANK) {
      for(String suit: Card.SUIT) {
        deck.add(new Card(rank, suit));

  public void shuffle() {
    collections.shuffle(deck);
  }

  public ArrayList<Card> getDeck() {
    return deck;
  }

  public static void main(String[] args) {
    Deck d = new Deck();
    System.out.println(d.getDeck());
    d.shuffle();
      System.out.println(d.getDeck());
  }

      }
    }
  }
}
