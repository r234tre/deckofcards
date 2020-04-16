
public class Card {

    //Array to contain face value and their face value corresponds to position in array
    private static final String[] FACE_VALUE = {null, "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"};

    //Array to contain different suits
    private static final String[] SUITS = {"hearts", "spades", "clubs", "diamonds"};

    private int suit;
    private int faceValue;

    Card(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // toString method to present face value and suit to user
    public String toString() {
        return FACE_VALUE[this.faceValue] + " of " + SUITS[this.suit];
    }
}
