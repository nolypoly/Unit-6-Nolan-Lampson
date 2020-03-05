public class Card implements Comparable{}
public class Card {
  public static final String[] RANK = {"A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2"};

  public static final String[] SUIT = {"♤, ♡, ♢, ♧"};

  public Card (String[] SUIT, String[] RANK);
    this.rank = RANK;
    this.suit = SUIT;

  public String getRank() {
    return rank;
  }

  public String getSuit() {
    return suit;
  }

  public int compareTo (Object other) {
    Card otherCard = (Card) other;
  }

  public int getRankValue (String rank) {
    for (int i = 0; i < rank.length; i++){
      if (this.rank.equals(RANK[i])) {
        return 14 - i;
      }
    return -1;
  }

  public static void main (String[]args) {
    Card c1 = new Card(RANK[0], SUIT[0]);
    Card c2 = new Card(RANK[RANK.length -1], SUIT[SUIT.length -1]);
    
  }

  public String toString(){

  }


}
