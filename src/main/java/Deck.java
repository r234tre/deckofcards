import java.util.Random;

public class Deck {

    private Card[] deck;
    private Random randomGenerator;
    private int cardsInDeck;

    // Constructor to initialize required objects and to create a fresh deck
    public Deck() {
        this.randomGenerator = new Random();
        this.deck = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck[index] = new Card(suit, rank);
                index++;
            }
        }
    }

    // method to shuffle deck
    public void shuffle() {
        this.cardsInDeck = 52;
        for (int i=0; i< 52; i++) {
            int randPosition = i + randomGenerator.nextInt(52 - i);
            Card temp = deck[i];
            deck[i] = deck[randPosition];
            deck[randPosition] = temp;
        }

    }

    // method to deal a card
    public  void dealOneCard() {
        // check to stop dealing cards
        if (cardsInDeck == 0) {
            //do nothing when all cards are dealt
        } else {
            cardsInDeck--;
            // present card to the player.
            System.out.println(deck[cardsInDeck].toString() + ":");
        }
    }
}
