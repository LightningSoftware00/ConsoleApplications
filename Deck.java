package GeneralReviewQuestionsSectionTwo;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] deck = new String[52];
        createDeck(deck);
        String[] cardSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        shuffleTheDeck(deck);  //
        showDeck(deck, cardValues, cardSuits);
    }

    private static void createDeck(String[] deck) {
        String[] cardSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int index = 0;
        for (String suit : cardSuits) {
            for (String value : cardValues) {
                deck[index] = value + " of " + suit;
                index++;
            }
        }
    }

    private static void showDeck(String[] deck, String[] cardValues, String[] cardSuits) {
        for (int i = 0; i < 4; i++) {
            int randomIndex = (int) (Math.random() * 52);
            String card = deck[randomIndex];
            System.out.println(card);
        }
    }

    private static void shuffleTheDeck(String[] deck) {

        for (int i = deck.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;

        }
    }
}
