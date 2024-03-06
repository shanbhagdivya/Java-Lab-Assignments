package lab4;
public class Card implements Comparable<Card> {
    public static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King"};

    private final int rank;
    private final String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return ranks[rank - 1] + " of " + suit;
    }

    @Override
    public int compareTo(Card other) {
        if (this.rank != other.rank) {
            return Integer.compare(this.rank, other.rank);
        } else {
            return this.suit.compareTo(other.suit);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card other = (Card) obj;
        return rank == other.rank && suit.equals(other.suit);
    }
}
