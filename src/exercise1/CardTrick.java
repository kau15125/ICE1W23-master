package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        CardTrick trick = new CardTrick();
        trick.performCardTrick();
    }

    private void performCardTrick() {
        Card[] hand = generateRandomHand();
        Card userCard = getUserCard();

        boolean matchFound = searchForCard(hand, userCard);

        if (matchFound) {
            printInfo();
        }
    }

    private Card[] generateRandomHand() {
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        return hand;
    }

    private Card getUserCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of your card (1-10): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the suit of your card (0-3): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        return userCard;
    }

    private boolean searchForCard(Card[] hand, Card userCard) {
        for (Card card : hand) {
            if (card.equals(userCard)) {
                return true;
            }
        }
        return false;
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is Kiranpreet Kaur");
        System.out.println();
        System.out.println("My future goal is :");
        System.out.println("--I want to do a Real Estate business");
        System.out.println("I love watching movies");
        System.out.println();
        System.out.println("Other hobbies");
        System.out.println("spending time with my friends and family");
        System.out.println("playing Uno");
        System.out.println("staying alone sometimes");
        System.out.println();
        

        // ... (rest of the printInfo() method remains the same)
    }
}
