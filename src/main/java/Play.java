import java.util.Scanner;

public class Play {

    //Driver code to play and make it interactive
    public static void main(String [] args) {
        //Create a new Deck
        Deck deck = new Deck();

        try {
            deck.shuffle();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Deck of cards ready, Lets Play !");
            System.out.println("Please type deal for a card to be dealt:");

            // take input from user interface and check which what operation to trigger
            while (true) {
                String name = scanner.next();
                if (name.equals("deal")) {
                    deck.dealOneCard();
                } else {
                    System.out.println("Please type deal");
                }
            }
        } catch (Exception e) {
            System.out.println("Please try again or try entering shuffle or deal");
        }
    }
}
